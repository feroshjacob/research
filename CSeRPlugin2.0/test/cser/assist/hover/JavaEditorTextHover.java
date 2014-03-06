package cser.assist.hover;

import java.io.File;

import org.eclipse.jdt.ui.text.java.hover.IJavaEditorTextHover;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.ui.IEditorPart;

public class JavaEditorTextHover implements IJavaEditorTextHover {

	public void setEditor(IEditorPart editor) {
		File f=null;
		 if (!delete(f)) {
			    String message = "Unable to delete file "
			        + f.getAbsolutePath();
			    boolean failonerror = false;
				if (failonerror) {
			        throw new RuntimeException(message);
			    } else {
			        boolean quiet;

			    }
			}




	}

	private boolean delete(File f) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		// TODO Auto-generated method stub
		return null;
	}

	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		// TODO Auto-generated method stub

		return null;
		

	}

}
