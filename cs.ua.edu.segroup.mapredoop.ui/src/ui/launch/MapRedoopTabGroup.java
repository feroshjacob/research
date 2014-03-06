package ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;

public class MapRedoopTabGroup extends AbstractLaunchConfigurationTabGroup {

	public MapRedoopTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				 	new HadoopTab(),
			//	 	new AmazonTab(),
				 	new JavaArgumentsTab(),
					//new JavaJRETab(),
				 	//new JavaClasspathTab(),
				 //	new SourceLookupTab(),
				 	new CommonTab()
				 	} ;
				 	setTabs(tabs);
	}

	
}
