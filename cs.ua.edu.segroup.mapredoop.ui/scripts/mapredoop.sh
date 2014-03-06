#!/bin/bash
echo "$1,$2,$3,$4"
cd /home/ferosh/research/cloud/scripts/
echo "Starting the cluster"
$2/src/contrib/ec2/bin/hadoop-ec2 launch-cluster mapredoop 2 > out.txt || { echo "connection failed"; exit 1; } 
server=`grep 'Master is' out.txt |cut -d"," -f1|cut -d" " -f3`

echo "Cluster started with master $server"
cur=`pwd`
cd /home/ferosh/research/cloud/runtime-EclipseApplication/JavaUtils/bin
echo "Main-Class: "hadoop.$1.Driver > mainclass
jar cmf mainclass mapredoop.jar hadoop
mv mapredoop.jar $cur/
cd $cur
echo " Jar moving to master"
scp -i ~/.ec2/id_rsa-gsg-keypair  mapredoop.jar "root@"$server":/tmp" || { echo "connection failed"; exit 1; } 
echo " Input $3 moving to master"
scp -i ~/.ec2/id_rsa-gsg-keypair  $3 "root@"$server":/tmp/input" || { echo "command failed"; exit 1; }
echo " Configuring the master"
scp -i ~/.ec2/id_rsa-gsg-keypair  cmds.sed "root@"$server":/tmp/cmds.sed" || { echo "command failed"; exit 1; }
ssh -i ~/.ec2/id_rsa-gsg-keypair "root@"$server 'cat /usr/local/hadoop-0.19.0/conf/hadoop-site.xml|sed -f /tmp/cmds.sed >/tmp/hadoop-site.xml' || { echo "command failed"; exit 1; }
ssh -i ~/.ec2/id_rsa-gsg-keypair "root@"$server 'cp /tmp/hadoop-site.xml /usr/local/hadoop-0.19.0/conf/hadoop-site.xml' || { echo "command failed"; exit 1; }
for SLEEPCOUNT in `seq 1 75`
do
    sleep 1
	echo "waiting for $SLEEPCOUNT/75 seconds for the slaves to catch up "
done
echo " Upload data to dfs server"
ssh -i ~/.ec2/id_rsa-gsg-keypair  "root@"$server '/usr/local/hadoop-0.19.0/bin/hadoop dfs -copyFromLocal /tmp/input input'|| { echo "command failed"; exit 1; } 
echo " Runing the program"
ssh -i ~/.ec2/id_rsa-gsg-keypair  "root@"$server '/usr/local/hadoop-0.19.0/bin/hadoop jar /tmp/mapredoop.jar mapredoop input output'|| { echo "command failed"; exit 1; } 
echo " Collecting the results"
ssh -i ~/.ec2/id_rsa-gsg-keypair  "root@"$server '/usr/local/hadoop-0.19.0/bin/hadoop dfs -getmerge output /tmp/output'|| { echo "command failed"; exit 1; } 
echo " Downloading to local $4"
scp -i ~/.ec2/id_rsa-gsg-keypair "root@"$server":/tmp/output" $4|| { echo "command failed"; exit 1; } 
echo " Shutting down the cluster"
$2/src/contrib/ec2/bin/hadoop-ec2 terminate-cluster mapredoop 2 > out.txt || { echo "connection failed"; exit 1; } 


