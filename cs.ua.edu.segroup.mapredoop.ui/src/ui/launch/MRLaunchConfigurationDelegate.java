package ui.launch;

import hdp.parser.MainParser;

import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

import ui.commands.CommandProcessor;
import utils.FileUtils;


@SuppressWarnings("deprecation")
public class MRLaunchConfigurationDelegate extends JavaLaunchDelegate {

	private ILaunchConfiguration configuration=null;
	@Override
	public void launch(final ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
        this.configuration= configuration;
        IFile progfile =  FileBuffers.getWorkspaceFileAtLocation(new Path(getFileName()));
       //System.out.println( progfile.getProject().getLocation());
      String[] args = getFileName().replaceAll(".hdp", "").split("/"); 
       monitor.beginTask("Running in Localhost", 1);
       boolean value = configuration.getAttribute(IMRLaunchConfigurationConstants.EXECUTE_IN_EC2, false);
       
         new CommandProcessor(value,args[args.length-1], getHadoopPath(),getInputFileName(), getOutputFileName()
        		 ,progfile.getProject().getLocation().toString());
       monitor.done();
      
   }



 
	private String getFileName() { 
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.MR_FILE_NAME, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}


	private String getHadoopPath() {
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.HADOOP_DISTRIBUTION, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}
	private String getInputFileName() {
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.HADOOP_INPUT_FILE, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}
	private String getOutputFileName() {
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.HADOOP_OUTPUT_FILE, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}

}
