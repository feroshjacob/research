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
jar cmf mainclass $PROGRAM_NAME-mapredoop.jar hadoop               
mv $PROGRAM_NAME-mapredoop.jar $cur/    
echo "Main-Class: "hadoop.utils.GenFileReader > mainclass  
echo "Class-Path: "$HADOOP_HOME/hadoop-0.20.2-core.jar $HADOOP_HOME/lib/commons-logging-1.0.4.jar $HADOOP_HOME/lib/commons-cli-1.2.jar $HADOOP_HOME/lib/commons-httpclient-3.1.jar >> mainclass 
jar cmf mainclass $PROGRAM_NAME-converter.jar hadoop 
mv $PROGRAM_NAME-converter.jar $cur/                          
cd $cur
java -jar $PROGRAM_NAME-converter.jar write $INPUT_PATH 
$HADOOP_HOME/bin/hadoop jar $PROGRAM_NAME-mapredoop.jar "$INPUT_PATH"seq "$OUTPUT_PATH"seq
java -jar $PROGRAM_NAME-converter.jar  "$OUTPUT_PATH"seq/part-r-00000 $OUTPUT_PATH


