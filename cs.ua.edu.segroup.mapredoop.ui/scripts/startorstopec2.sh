#!/bin/bash
if $1;then
echo "Starting the cluster with name $2 and slaves: $3"
    /home/ferosh/research/cloud/hadoop-0.20.2/src/contrib/ec2/bin/hadoop-ec2 launch-cluster $2 $3 > out.txt || { echo "connection failed"; exit 1; } 
else
    cluster_name=`grep group: out.txt |cut -d" " -f7`
    echo "terminating the cluster with name $cluster_name"
    /home/ferosh/research/cloud/hadoop-0.20.2/src/contrib/ec2/bin/hadoop-ec2 terminate-cluster $cluster_name || { echo "connection failed"; exit 1; }
fi 

