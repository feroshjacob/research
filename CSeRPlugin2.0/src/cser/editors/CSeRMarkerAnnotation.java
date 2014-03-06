package cser.editors;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.quickassist.IQuickFixableAnnotation;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.ImageUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.SimpleMarkerAnnotation;

import cser.Activator;
import cser.utils.FileUtils;





@SuppressWarnings({"unchecked","restriction"})
public class CSeRMarkerAnnotation  extends SimpleMarkerAnnotation implements IQuickFixableAnnotation {

	/**
	 * The layer in which markers representing problem are located.
	 *
	 * @since 2.0
	 * @deprecated As of 3.0, replaced by {@link IAnnotationAccessExtension}

	 */
	public final static int PROBLEM_LAYER= 5;
	
	/** Internal image registry. */
	
	private static Map fgImageRegistry;
	private static String ID_ = "cser.marker";

	/**
	 * Returns an image for the given display as specified by the given image
	 * descriptor.
	 *
	 * @param display the display
	 * @param descriptor the image descriptor
	 * @return an image for the display as specified by the descriptor
	 * @deprecated As of 3.0, visual presentation is no longer supported,
	 *             annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 */
	protected static Image getImage(Display display, ImageDescriptor descriptor) {
		Map map= getImageRegistry(display);
		Image image= (Image) map.get(descriptor);
		if (image == null) {
			image= descriptor.createImage();
			map.put(descriptor, image);
		}
		return image;
	}

	/**
	 * Returns an image registry for the given display. If no such registry
	 * exists the registry is created.
	 *
	 * @param display the display
	 * @return the image registry for the given display
	 * @deprecated As of 3.0, visual presentation is no longer supported,
	 *             annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 */
	protected static Map getImageRegistry(Display display) {
		if (fgImageRegistry == null) {
			fgImageRegistry= new HashMap();
			display.disposeExec(new Runnable() {
				public void run() {
					if (fgImageRegistry != null) {
						Map map= fgImageRegistry;
						fgImageRegistry= null;
						Iterator e= map.values().iterator();
						while (e.hasNext()) {
							Image image= (Image) e.next();
							if (!image.isDisposed())
								image.dispose();
						}
					}
				}
			});
		}
		return fgImageRegistry;
	}


	/** The image, i.e., visual presentation of this annotation. */
	private Image fImage;
	/** The image name. */
	private String fImageName;
	/** The presentation layer. */
	private int fPresentationLayer= -1;

	/**
	 * Tells whether this annotation is quick fixable.
	 * @since 3.4
	 */
	private boolean fIsQuickFixable;
	/**
	 * Tells whether the quick fixable state (<code>fIsQuickFixable</code> has been computed.
	 * @since 3.4
	 */
	private boolean fIsQuickFixableStateSet;

	
	/**
	 * Creates a new annotation for the given marker.
	 *
	 * @param marker the marker
	 */
	public CSeRMarkerAnnotation(IMarker marker) {
		super(marker);
	}

	/**
	 * Creates a new annotation of the given type for the given marker.
	 *
	 * @param annotationType the annotation type
	 * @param marker the marker
	 * @throws CoreException 
	 * @since 3.0
	 */
	public CSeRMarkerAnnotation(String annotationType,String message,IFile file) throws CoreException{
		super(annotationType, file.createMarker(ID_));
		initialize();
		update();
		getMarker().setAttribute(IMarker.MESSAGE, message);
		getMarker().setAttribute(IMarker.SOURCE_ID, FileUtils.getRelativeFileName(file));
	}

	/**
	 * Sets the marker image to the given image.
	 *
	 * @param image the new marker image
	 * @deprecated As of 3.0, visual presentation is no longer supported,
	 *             annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 */
	protected void setImage(Image image) {
		fImage= image;
	}

	/**
	 * Initializes the annotation's icon representation and its drawing layer
	 * based upon the properties of the underlying marker.
	 *
	 * @deprecated As of 3.0, visual presentation is no longer supported,
	 *             annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 */
	protected void initialize() {


/*		if (MarkerUtilities.isMarkerType(marker, IMarker.TASK)) {
			name= IDE.SharedImages.IMG_OBJS_TASK_TSK;
		} else if (MarkerUtilities.isMarkerType(marker, IMarker.BOOKMARK)) {
			name= IDE.SharedImages.IMG_OBJS_BKMRK_TSK;
		} else if (MarkerUtilities.isMarkerType(marker, IMarker.PROBLEM)) {
			switch (MarkerUtilities.getSeverity(marker)) {
				case IMarker.SEVERITY_INFO:
					name= ISharedImages.IMG_OBJS_INFO_TSK;
					break;
				case IMarker.SEVERITY_WARNING:
					name= ISharedImages.IMG_OBJS_WARN_TSK;
					break;
				case IMarker.SEVERITY_ERROR:
					name= ISharedImages.IMG_OBJS_ERROR_TSK;
					break;
			}
		}*/

		fImage= null;
		fImageName= "refresh.png";
	}

	/**
	 * Returns the annotations drawing layer.
	 * <p>
	 * Note: This is only for backward compatibility.
	 * </p>
	 * @return the annotations drawing layer
	 * @deprecated As of 3.0, replaced by {@link org.eclipse.jface.text.source.IAnnotationAccessExtension#getLayer(org.eclipse.jface.text.source.Annotation)}
	 * @since 3.0
	 */
	public int getLayer() {
		if (fPresentationLayer != -1)
			// Backward compatibility
			return fPresentationLayer;

		AnnotationPreference preference= EditorsPlugin.getDefault().getAnnotationPreferenceLookup().getAnnotationPreference(this);
		if (preference != null)
			return preference.getPresentationLayer();
		return IAnnotationAccessExtension.DEFAULT_LAYER;
	}

	/**
	 * Sets the layer of this annotation.
	 * <p>
	 * Note: This is only for backward compatibility.
	 * </p>
	 * @param layer the layer of this annotation
	 * @deprecated As of 3.0, annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 *
	 * @since 3.0
	 */
	protected void setLayer(int layer) {
		fPresentationLayer= layer;
	}

	/**
	 * Implement this method to draw a graphical representation of this
	 * annotation within the given bounds. This default implementation does
	 * nothing.
	 * <p>
	 * Note: This is only for backward compatibility.
	 * </p>
	 * @param gc the drawing GC
	 * @param canvas the canvas to draw on
	 * @param r the bounds inside the canvas to draw on
	 * @deprecated As of 3.0 replaced by {@link org.eclipse.jface.text.source.IAnnotationAccessExtension#paint(org.eclipse.jface.text.source.Annotation, GC, Canvas, Rectangle)}
	 * @since 3.0
	 */
	public void paint(GC gc, Canvas canvas, Rectangle r) {
		Image image= getImage(canvas.getDisplay());
		if (image != null)
			ImageUtilities.drawImage(image, gc, canvas, r, SWT.CENTER, SWT.TOP);
	}

	/**
	 * Informs this annotation about changes applied to its underlying marker
	 * and adapts to those changes.
	 */
	public void update() {
		super.update();
		initialize();
	}

	/**
	 * Returns the name of an image used to visually represent markers of
	 * unknown type. This implementation returns <code>null</code>.
	 * Subclasses may replace this method.
	 *
	 * @param marker the marker of unknown type
	 * @return the name of an image for markers of unknown type.
	 * @deprecated As of 3.0, visual presentation is no longer supported,
	 *             annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 */
	protected String getUnknownImageName(IMarker marker) {
		return null;
	}

	/**
	 * Returns the image of the given name. Subclasses may extend this method.
	 * If so, subclasses must assume responsibility for disposing the images
	 * they create.
	 *
	 * @param name the name of the requested image
	 * @return the image or <code>null</code> if there is no such image
	 * @deprecated As of 3.0, visual presentation is no longer supported,
	 *             annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 */
	protected Image getImage(String name) {
		if (name != null)
			return Activator.getImageDescriptor( "open.gif").createImage();
		return null;
	}

	/**
	 * Returns an image for this annotation. It first consults the workbench
	 * adapter for this annotation's marker. If none is defined, it tries to
	 * find an image for the image name of this annotation.
	 *
	 * @param display the display for which the image is requested
	 * @return the image for this annotation
	 * @deprecated As of 3.0, visual presentation is no longer supported,
	 *             annotation with a visible presentation should implement
	 *             {@link org.eclipse.jface.text.source.IAnnotationPresentation}
	 */
	protected Image getImage(Display display) {
		if (fImage == null) {

			IMarker marker= getMarker();
			if (marker.exists()) {
				IWorkbenchAdapter adapter= (IWorkbenchAdapter) marker.getAdapter(IWorkbenchAdapter.class);
				if (adapter != null) {
					ImageDescriptor descriptor= adapter.getImageDescriptor(marker);
					if (descriptor != null)
						fImage= getImage(display, descriptor);
				}
			}

			if (fImage == null)
				fImage= getImage(fImageName);

		}
		return fImage;
	}

	/*
	 * @see org.eclipse.jface.text.quickassist.IQuickFixableAnnotation#setQuickFixable(boolean)
	 * @since 3.4
	 */
	public void setQuickFixable(boolean state) {
		fIsQuickFixable= state;
		fIsQuickFixableStateSet= true;
	}

	/*
	 * @see org.eclipse.jface.text.quickassist.IQuickFixableAnnotation#isQuickFixableStateSet()
	 * @since 3.4
	 */
	public boolean isQuickFixableStateSet() {
		return fIsQuickFixableStateSet;
	}

	/*
	 * @see org.eclipse.jface.text.quickassist.IQuickFixableAnnotation#isQuickFixable()
	 * @since 3.4
	 */
	public boolean isQuickFixable() {
		Assert.isTrue(isQuickFixableStateSet());
		return fIsQuickFixable;
	}

	public String getFileName() {

	String st="";
	try {
			st =getMarker().getAttribute(IMarker.SOURCE_ID)+"";
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

}