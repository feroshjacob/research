package ui.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

import cs.ua.edu.se.ui.MapRedoopUiModule;


public class HadoopTab extends JavaLaunchTab {
	private Text fHadoopText =null;
	private Text fInputText = null;
	private Text fOutputText = null;
	private Button fHadoopButton =null;
	private Button fInputButton=null; 
	private Button fOutputButton=null;
	private Text mrText;
	private Button mrButton;
	private Button executeInEC2;
	private Path mrPath;
	private final WidgetListener fListener = new WidgetListener();
	//private Text projText;
//	private Button projButton;


	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 0;
		comp.setLayout(topLayout);
		comp.setFont(font);

		// Project group
	//	projButton = createPushButton(parent, "Browse", null);
	//	projText = createGroup(comp, "project", projButton, null);

		createVerticalSpacer(comp, 1);
		mrButton = createPushButton(parent, "Search", null);
		executeInEC2 = createCheckButton(parent, "EC2");
	//	javaDebugCheckbox = createCheckButton(parent, "Java debug");
		mrText = createGroup(comp, "MapRedoop file", mrButton, new Button[] { executeInEC2 });
		createVerticalSpacer(comp, 1);
		fHadoopButton = createPushButton(parent, "Find", null);
		fInputButton = createPushButton(parent, "Browse", null);
		fOutputButton= createPushButton(parent, "Browse", null);
		fHadoopText = createGroup(comp, "Hadoop", fHadoopButton, null);
		fInputText = createGroup(comp, "Input file", fInputButton, null);
		fOutputText = createGroup(comp, "Output file", fOutputButton, null);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "Configure Hadoop details");
		
	}
	private Text createGroup(final Composite comp, final String title, final Button searchButton, final Button[] checkButtons) {
		Font font = comp.getFont();
		Group group = new Group(comp, SWT.NONE);
		group.setText(title);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setFont(font);
		Text text = new Text(group, SWT.SINGLE | SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		text.setFont(font);
		text.addModifyListener(fListener);
		searchButton.setParent(group);
		searchButton.addSelectionListener(fListener);
		if (checkButtons != null) {
			for (Button button : checkButtons) {
				button.setParent(group);
				GridData gd = new GridData();
				gd.horizontalSpan = 2;
				button.setLayoutData(gd);
				button.addSelectionListener(fListener);
			}
		}
		return text;
	}


	public void setDefaults(final ILaunchConfigurationWorkingCopy config) {
		// is called when a new LauchConfig is created
		// nothing to do
	}

	@Override
	public void initializeFrom(final ILaunchConfiguration config) {
		super.initializeFrom(config);

		try {
		//	projText.setText(config.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, ""));
			mrText.setText(config.getAttribute(IMRLaunchConfigurationConstants.MR_FILE_NAME, ""));
			executeInEC2.setSelection(config.getAttribute(
					IMRLaunchConfigurationConstants.EXECUTE_IN_EC2, false));
			fHadoopText.setText(config.getAttribute(IMRLaunchConfigurationConstants.HADOOP_DISTRIBUTION, ""));
			fInputText.setText(config.getAttribute(IMRLaunchConfigurationConstants.HADOOP_INPUT_FILE, ""));
			fOutputText.setText(config.getAttribute(IMRLaunchConfigurationConstants.HADOOP_OUTPUT_FILE, ""));
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	public Image getImage() {
		return MapRedoopUiModule.getImage("hadoop"); 
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "Hadoop Installation details";
	}
	//changes
	public void performApply(final ILaunchConfigurationWorkingCopy config) {
	//	config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, projText.getText().trim());
		config.setAttribute(IMRLaunchConfigurationConstants.MR_FILE_NAME,mrText.getText().trim());
		config.setAttribute(IMRLaunchConfigurationConstants.EXECUTE_IN_EC2, executeInEC2.getSelection());
		config.setAttribute(IMRLaunchConfigurationConstants.HADOOP_DISTRIBUTION, fHadoopText.getText().trim());
		config.setAttribute(IMRLaunchConfigurationConstants.HADOOP_INPUT_FILE, fInputText.getText().trim());
		config.setAttribute(IMRLaunchConfigurationConstants.HADOOP_OUTPUT_FILE, fOutputText.getText().trim());
	}

	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		String text = mrText.getText().trim();
		if (text.length() > 0) {
			if (getWorkspaceRoot().findMember(mrPath) == null) {
				setErrorMessage("File doesn't exist");
				return false;
			}
			
			else if (!text.endsWith("hdp"))
			{
				setErrorMessage("Need a mapredoop program");
				return false;
			}	
			return true;
						
		} 
		
		return super.isValid(launchConfig);	
		
		
	}

	private class WidgetListener implements ModifyListener, SelectionListener {

		public void modifyText(final ModifyEvent e) {
			updateLaunchConfigurationDialog();
		}

		public void widgetDefaultSelected(final SelectionEvent e) {
			// do nothing
		}

		public void widgetSelected(final SelectionEvent e) {
			Object source = e.getSource();
		//	if (source == projButton) {
		//		handleProjectButtonSelected();
		//	}
		   if (source == mrButton) {
				handleMrButtonSelected();
			}else if (source == fHadoopButton) {
				handleHadoopSelected();
			} else if (source == fInputButton) {
				handleInputFileSelected();
			}  
			else if (source == fOutputButton) {
				handleOutputFileSelected();
			}  
			 else {
				updateLaunchConfigurationDialog();
			}
		}
		
	}

	private void handleHadoopSelected() {
	          DirectoryDialog directoryDialog = new DirectoryDialog(getShell());
	          directoryDialog.setMessage("Please select a directory and click OK");
	          String dir = directoryDialog.open();
	          if(dir != null) {
	            fHadoopText.setText(dir);	           
	          }
	        }
	private void handleInputFileSelected() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), getWorkspaceRoot(),
				IResource.FILE);
		dialog.setTitle("Input file");
		dialog.setMessage("Select an input file");
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			fInputText.setText(file.getFullPath().toString());
		}
      }
	private void handleOutputFileSelected() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), getWorkspaceRoot(),
				IResource.FILE);
		dialog.setTitle("Output file");
		dialog.setMessage("Select an output file");
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			fOutputText.setText(file.getFullPath().toString());
		}      }

	private void handleMrButtonSelected() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), getWorkspaceRoot(),
				IResource.FILE);
		dialog.setTitle("MapRedoop");
		dialog.setMessage("Select a mapredoop file");
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			mrText.setText(file.getFullPath().toString());
		}
	}

	/*private void handleProjectButtonSelected() {
		IJavaProject project = chooseJavaProject();
		if (project == null) {
			return;
		}
		String projectName = project.getElementName();
		projText.setText(projectName);
	}
*/

	
	/*private IJavaProject chooseJavaProject() {
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), labelProvider);
		dialog.setTitle("MapRedoop");
		dialog.setMessage("select a javaProject");
		try {
			dialog.setElements(JavaCore.create(getWorkspaceRoot()).getJavaProjects());
		} catch (JavaModelException jme) {
			jme.printStackTrace();
		}
		IJavaProject javaProject = getJavaProject();
		if (javaProject != null) {
			dialog.setInitialSelections(new Object[] { javaProject });
		}
		if (dialog.open() == Window.OK) {
			return (IJavaProject) dialog.getFirstResult();
		}
		return null;
	}*/

	/*private IJavaProject getJavaProject() {
		String projectName = projText.getText().trim();
		if (projectName.length() < 1) {
			return null;
		}
		return JavaCore.create(getWorkspaceRoot()).getJavaProject(projectName);
	}*/

	private IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	public String getId() {
		return "ui.launch.HadoopTab"; //$NON-NLS-1$
	}
}