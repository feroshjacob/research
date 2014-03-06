package ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import ui.commands.ShellExecuter;


public class StopAmazon  extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		   new ShellExecuter(new String[]{"sh","startorstopec2.sh","false"},"Stoping ec2");
		return null;
	}

}
