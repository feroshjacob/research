package ui.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchTab;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import cs.ua.edu.se.ui.MapRedoopUiModule;

@SuppressWarnings("restriction")
public class AmazonTab extends JavaLaunchTab {

	private Text fAccountNumberText;
	private Text fSecretAccessKeyText;
	private Text fAccessKeyIdText;
	private Text fEc2HomeText;
	private Button fEc2HomeButton=null;
	private Text fClusternameText;
	private Text fNoofSlavesText;	
	//private final WidgetListener fListener = new WidgetListener();
	private class AmazonTabListener extends SelectionAdapter implements
			ModifyListener,SelectionListener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.
		 * events.ModifyEvent)
		 */
		
		public void modifyText(final ModifyEvent e) {
			updateLaunchConfigurationDialog();
		}

		public void widgetDefaultSelected(final SelectionEvent e) {
			// do nothing
		}

		public void widgetSelected(final SelectionEvent e) {
			Object source = e.getSource();
			if (source == fEc2HomeButton) {
				handleEC2HomeSelected();
			}
			else {
				updateLaunchConfigurationDialog();
			}
		}
	}

	private final AmazonTabListener fListener = new AmazonTabListener();

	
	private Text createGroup(final Composite comp, final String title,final Button searchButton) {
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
		return text;
	}
	private Text addToGroup(final Composite comp, final String title) {
		Font font = comp.getFont();
		SWTFactory.createLabel(comp, title, 1);  
		Text text =null;
		if(title=="Secret Access Key")
		{
			 text = new Text(comp, SWT.SINGLE | SWT.PASSWORD
					| SWT.BORDER);
		}	
		else 
		{
			
			 text = new Text(comp, SWT.SINGLE | SWT.BORDER);
		}
		
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		text.setFont(font);
		text.addModifyListener(fListener);		
		return text;
	}

	public void createControl(Composite parent) {
		Composite comp = SWTFactory.createComposite(parent, 1, 1,
				GridData.FILL_HORIZONTAL);
		setControl(comp);		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "EC2");
		
		Group group = new Group(comp, SWT.NONE);
		group.setText("Amazon Credentials");
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setFont(comp.getFont());
		
		fAccountNumberText = addToGroup(group, "Account Number / EC2 UserID");		
		fAccessKeyIdText =addToGroup(group, "Access Key Id");	
		fSecretAccessKeyText = addToGroup(group, "Secret Access Key");
		
		
		fEc2HomeButton = createPushButton(parent, "Find",null);
		fEc2HomeText = createGroup(comp, "EC2 Details",fEc2HomeButton);
		Group group1 = new Group(comp, SWT.NONE);
		group1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group1.setText("Cluster Details");
		group1.setLayout(layout);
		group1.setFont(comp.getFont());
		fClusternameText=addToGroup(group1, "Cluster Name");
		fNoofSlavesText = addToGroup(group1, "No of Slaves");				    
		 Dialog.applyDialogFont(parent);
	}

	/**
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#isValid(ILaunchConfiguration)
	 */
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		if (getAccountNumber().length() < 1) {
			setErrorMessage("Account number cannot be empty");
			return false;
		}
		if (fAccessKeyIdText.getText().length() < 1) {
			setErrorMessage("Access key cannot be empty");
			return false;
		}
		if (getSecretAccessKey().length() < 1) {
			setErrorMessage("Secret code cannot be empty");
			return false;
		}
		if(getEc2Home().length()<1)
		{
			setErrorMessage("EC2 name cannot be empty");
			return false;
		}
		if (getClusterName().length() < 1) {
			setErrorMessage("Cluster name cannot be empty");
			return false;
		}
		if (getNoofSlaves().length() < 1) {
			setErrorMessage("Slaves field  cannot be empty");
			return false;
		}
		return true;
	}

	/**
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				IMRLaunchConfigurationConstants.ACCOUNT_NUMBER,
				getAccountNumber());
		configuration.setAttribute(IMRLaunchConfigurationConstants.SECRET_KEY,
				getSecretAccessKey());
		configuration.setAttribute(IMRLaunchConfigurationConstants.ACCESS_KEY,
				getAccessKey());
		configuration.setAttribute(IMRLaunchConfigurationConstants.EC2_HOME,
				getEc2Home());
		configuration.setAttribute(
				IMRLaunchConfigurationConstants.AMAZON_CLUSTER_NAME,
				getClusterName());
		configuration.setAttribute(
				IMRLaunchConfigurationConstants.NUMBER_OF_SLAVES,
				getNoofSlaves());
	}

	/**
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(ILaunchConfiguration)
	 */
	public void initializeFrom(ILaunchConfiguration config) {

		try {
			fAccountNumberText.setText(config.getAttribute(
					IMRLaunchConfigurationConstants.ACCOUNT_NUMBER, ""));
			fSecretAccessKeyText.setText(config.getAttribute(
					IMRLaunchConfigurationConstants.SECRET_KEY, ""));
			fAccessKeyIdText.setText(config.getAttribute(
					IMRLaunchConfigurationConstants.ACCESS_KEY, ""));
			fEc2HomeText.setText(config.getAttribute(
					IMRLaunchConfigurationConstants.EC2_HOME, ""));
			fClusternameText.setText(config.getAttribute(
					IMRLaunchConfigurationConstants.AMAZON_CLUSTER_NAME, ""));
			fNoofSlavesText.setText(config.getAttribute(IMRLaunchConfigurationConstants.NUMBER_OF_SLAVES,""));
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
		
	private void handleEC2HomeSelected() {
        DirectoryDialog directoryDialog = new DirectoryDialog(getShell());
        directoryDialog.setMessage("Please select a directory and click OK");
        String dir = directoryDialog.open();
        if(dir != null) {
          fEc2HomeText.setText(dir);	           
        }
      }

	/**
	 * Returns the current width specified by the user
	 * 
	 * @return the width specified by the user
	 */
	private String getAccountNumber() {
		return fAccountNumberText.getText().trim();
	}

	/**
	 * Returns the current height specified by the user
	 * 
	 * @return the height specified by the user
	 */
	private String getSecretAccessKey() {
		return fSecretAccessKeyText.getText().trim();
	}
	private String getAccessKey() {
		return fAccessKeyIdText.getText().trim();
	}
	private String getEc2Home() {
		return fEc2HomeText.getText().trim();
	}
	private String getClusterName() {

		return fClusternameText.getText().trim();
	}
	private String getNoofSlaves() {

		return fNoofSlavesText.getText().trim();
	}
	/**
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	/**
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "MapRedoop EC2 (Amazon)";
	}

	/**
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getId()
	 * 
	 * @since 3.3
	 */
	public String getId() {
		return "ui.launch.mapredoop.ec2"; //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getImage()
	 */
	public Image getImage() {
		return MapRedoopUiModule.getImage("ec2");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#activated(org.eclipse.debug
	 * .core.ILaunchConfigurationWorkingCopy)
	 */
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		// do nothing when activated
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#deactivated(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
		// do nothing when de-activated
	}
}