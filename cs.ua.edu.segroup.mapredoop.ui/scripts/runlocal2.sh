#!/bin/bash
#name of program, input, output, hadoop_home, project_home
PROGRAM_NAME=$1
INPUT_PATH=$2
OUTPUT_PATH=$3
HADOOP_HOME=$4
PROJECT_HOME=$5
echo "$PROGRAM_NAME,$INPUT_PATH,$OUTPUT_PATH,$HADOOP_HOME"
if [ -d $PROGRAM_NAME ]; then
	rm -r $PROGRAM_NAME
fi 
mkdir $PROGRAM_NAME
cd $PROGRAM_NAME 
cur=`pwd`
cd $PROJECT_HOME/bin
echo "Main-Class: "hadoop.core.Main > mainclass 
jar cmf mainclass mapredoop.jar hadoop               
mv mapredoop.jar $cur/    
echo "Main-Class: "hadoop.utils.NodeFileReader > mainclass  
echo "Class-Path: "$HADOOP_HOME/hadoop-0.20.2-core.jar $HADOOP_HOME/lib/commons-logging-1.0.4.jar $HADOOP_HOME/lib/commons-cli-1.2.jar $HADOOP_HOME/lib/commons-httpclient-3.1.jar >> mainclass 
jar cmf mainclass $PROGRAM_NAME-converter.jar hadoop 
mv $PROGRAM_NAME-converter.jar $cur/                          
cd $cur
java -jar $PROGRAM_NAME-converter.jar write $INPUT_PATH 

server=`grep 'Master is' ../out.txt |cut -d"," -f1|cut -d" " -f3`
echo "Running in master $server"


echo " Jar moving to master"
scp -i ~/.ec2/id_rsa-gsg-keypair  mapredoop.jar "root@"$server":/tmp" || { echo "connection failed"; exit 1; } 
echo " Input $INPUT_PATH moving to master"
scp -i ~/.ec2/id_rsa-gsg-keypair  "$INPUT_PATH"seq "root@"$server":/tmp/input" || { echo "command failed"; exit 1; }
echo " Configuring the master"
scp -i ~/.ec2/id_rsa-gsg-keypair  ../cmds.sed "root@"$server":/tmp/cmds.sed" || { echo "command failed"; exit 1; }
ssh -i ~/.ec2/id_rsa-gsg-keypair "root@"$server 'cat /usr/local/hadoop-0.20.2/conf/hadoop-site.xml|sed -f /tmp/cmds.sed >/tmp/hadoop-site.xml' || { echo "command failed"; exit 1; }
ssh -i ~/.ec2/id_rsa-gsg-keypair "root@"$server 'cp /tmp/hadoop-site.xml /usr/local/hadoop-0.20.2/conf/hadoop-site.xml' || { echo "command failed"; exit 1; }

echo " Upload data to dfs server"
ssh -i ~/.ec2/id_rsa-gsg-keypair  "root@"$server '/usr/local/hadoop-0.20.2/bin/hadoop dfs -copyFromLocal /tmp/input input'|| { echo "command failed"; exit 1; } 
echo " Runing the program"
ssh -i ~/.ec2/id_rsa-gsg-keypair  "root@"$server '/usr/local/hadoop-0.20.2/bin/hadoop jar /tmp/mapredoop.jar input output'|| { echo "command failed"; exit 1; } 
echo " Collecting the results"
ssh -i ~/.ec2/id_rsa-gsg-keypair  "root@"$server '/usr/local/hadoop-0.20.2/bin/hadoop dfs -get output/part-r-00000 /tmp/output'|| { echo "command failed"; exit 1; } 
echo " Downloading to local $OUTPUT_PATH"
scp -i ~/.ec2/id_rsa-gsg-keypair "root@"$server":/tmp/output" "$OUTPUT_PATH"seq|| { echo "command failed"; exit 1; } 
java -jar $PROGRAM_NAME-converter.jar  "$OUTPUT_PATH"seq $OUTPUT_PATH


