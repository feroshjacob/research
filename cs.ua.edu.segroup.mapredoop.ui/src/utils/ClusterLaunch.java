package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.console.MessageConsole;

import ui.commands.CommandProcessor;
import ui.commands.ShellExecuter;

public class ClusterLaunch extends PopupDialog {
	
	public ClusterLaunch(Shell parent, int shellStyle, boolean takeFocusOnOpen,
			boolean persistSize, boolean persistLocation,
			boolean showDialogMenu, boolean showPersistActions,
			String titleText, String infoText) {
		super(parent, shellStyle, takeFocusOnOpen, persistSize, persistLocation,
				showDialogMenu, showPersistActions, titleText, infoText);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);
		composite.setFont(parent.getFont());

	
	    // Display the input box
	    final Text clusterNametxt =  addToGroup(composite, "Cluster Name");
	    final Text clusterNumtxt =  addToGroup(composite, "Number of Clusters");
	    // Create the OK button and add a handler
	    // so that pressing it will set input
	    // to the entered value
	    Button ok = new Button(composite, SWT.PUSH);
	    ok.setText("Start");
	    ok.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    ok.addSelectionListener(new SelectionAdapter() {
	      public void widgetSelected(SelectionEvent event) {
	    	    new ShellExecuter(new String[]{"sh","startorstopec2.sh","true",clusterNametxt.getText(),clusterNumtxt.getText()}, "Starting ec2");
	         getShell().close();
	      }
	    });
		return composite;
	}
	private Text addToGroup(final Composite comp, final String title) {
		Font font = comp.getFont();
		SWTFactory.createLabel(comp, title, 1);  
		Text text =null;
		text = new Text(comp, SWT.SINGLE | SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		text.setFont(font);
		return text;
	}



}
