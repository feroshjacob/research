package ui.commands;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class ShellExecuter {
	
	public ShellExecuter(String[] args, String jobName) {
		execute(args, jobName);
	}

	private void execute(final String[] args, String jobName) {
        Job job = new Job(jobName) {
	        protected IStatus run(IProgressMonitor monitor) {
                  launchShell(args);
	              return Status.OK_STATUS;
	           }

			private void launchShell(String[] args) {
				try {
					
					ProcessBuilder pb = new ProcessBuilder(args);
				//	ProcessBuilder pb = new ProcessBuilder("ssh","-i","/home/ferosh/.ec2/id_rsa-gsg-keypair","root@ec2-50-16-160-158.compute-1.amazonaws.com","'/usr/local/hadoop-0.19.0/bin/hadoop dfs -ls'");
					//pb.command(new String[]{binpath+ "/src/contrib/ec2/bin/hadoop-ec2","launch-cluster", "segroup", "2"});
					Process p = pb.start();
					String line ="";
					MessageConsole myConsole = findConsole("MRRconsole");
					OutputStream outputStream = myConsole.newOutputStream();
				      BufferedReader input =
				          new BufferedReader
				            (new InputStreamReader(p.getInputStream()));
				      BufferedReader out =
				          new BufferedReader
				            (new InputStreamReader(p.getInputStream()));
				     
				      BufferedReader error =
				          new BufferedReader
				            (new InputStreamReader(p.getErrorStream()));
				      outputStream.write("Starting..".getBytes());
				        while (((line = input.readLine()) != null)||((line = error.readLine()) != null)) {
				          outputStream.write(("\n"+line).getBytes());
				         // if(myConsole.getInputStream()!=null) myConsole.geto
				        }
				        input.close();
				        error.close();
					outputStream.write("\ndone".getBytes());
					outputStream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				
			}
			private MessageConsole findConsole(String name) {
				ConsolePlugin plugin = ConsolePlugin.getDefault();
				IConsoleManager conMan = plugin.getConsoleManager();
				IConsole[] existing = conMan.getConsoles();
				for (int i = 0; i < existing.length; i++)
					if (name.equals(existing[i].getName())) {
						conMan.showConsoleView(existing[i]);
						return (MessageConsole) existing[i];
					}
				// no console found, so create a new one
				MessageConsole myConsole = new MessageConsole(name, null);
				conMan.addConsoles(new IConsole[] { myConsole });
				conMan.showConsoleView(myConsole);
				return myConsole;
			}
	        };
	     job.setPriority(Job.SHORT);
	     job.schedule(); // start as soon as possible

		
	}

}
