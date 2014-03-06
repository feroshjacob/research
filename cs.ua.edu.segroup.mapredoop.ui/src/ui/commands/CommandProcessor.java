package ui.commands;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

import ui.launch.IMRLaunchConfigurationConstants;

public class CommandProcessor {
	
	String programName,hadoopPath, inputFileName, outputFileName, projectPath;
	public CommandProcessor() {
		executeCommands();
	}
	
	public CommandProcessor(boolean ec2flag, String programName, String hadoopPath,
			String inputFileName, String outputFileName, String projectPath) {
		this.hadoopPath= hadoopPath;
		this.programName=programName;
		this.projectPath = projectPath;
		this.inputFileName=makeCompletePath(inputFileName);
		this.outputFileName=makeCompletePath(outputFileName);
		if(ec2flag){
	        executeEC2Commands();
		}
		else{
			executeCommands();
		}
		
	}

	private String makeCompletePath(String inputFileName2) {
		String[] args = inputFileName2.split("/");
		StringBuffer buffer = new StringBuffer();
		for(int i=2; i<args.length;i++ ){
			buffer.append("/"+args[i]);
		}
		return projectPath + buffer.toString();
	}

	private void executeCommands() {
		 new ShellExecuter( new String[]{"sh", "runlocal.sh", programName, inputFileName, outputFileName,
				 hadoopPath, projectPath}, "Running in local hadoop");
		}
	private void executeEC2Commands() {
		 new ShellExecuter( new String[]{"sh", "runlocal2.sh", programName, inputFileName, outputFileName,
				 hadoopPath, projectPath}, "Running in EC2 hadoop cluster");
		}
	

}
