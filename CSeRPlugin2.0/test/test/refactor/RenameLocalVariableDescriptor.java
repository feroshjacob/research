package test.refactor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.refactoring.IJavaRefactorings;
import org.eclipse.jdt.core.refactoring.descriptors.JavaRefactoringDescriptor;
import org.eclipse.jdt.internal.core.refactoring.descriptors.DescriptorMessages;
import org.eclipse.ltk.core.refactoring.RefactoringContribution;
import org.eclipse.ltk.core.refactoring.RefactoringCore;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

/**
 * Refactoring descriptor for the rename local variable refactoring.
 * <p>
 * An instance of this refactoring descriptor may be obtained by calling
 * {@link RefactoringContribution#createDescriptor()} on a refactoring
 * contribution requested by invoking
 * {@link RefactoringCore#getRefactoringContribution(String)} with the
 * appropriate refactoring id.
 * </p>
 * <p>
 * Note: this class is not intended to be instantiated by clients.
 * </p>
 * 
 * @since 3.3
 */
public final class RenameLocalVariableDescriptor extends JavaRefactoringDescriptor {

	/** The name attribute */
	private String fName= null;

	/** The references attribute */
	private boolean fReferences= false;

	/** The selection attribute */
	private ISourceRange fSelection= null;

	/** The compilation unit attribute */
	private ICompilationUnit fUnit= null;

	/**
	 * Creates a new refactoring descriptor.
	 */
	public RenameLocalVariableDescriptor() {
		super(IJavaRefactorings.RENAME_LOCAL_VARIABLE);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void populateArgumentMap() {
		super.populateArgumentMap();
		fArguments.put(JavaRefactoringDescriptor.ATTRIBUTE_NAME, fName);
		fArguments.put(JavaRefactoringDescriptor.ATTRIBUTE_INPUT, elementToHandle(getProject(), fUnit));
		fArguments.put(JavaRefactoringDescriptor.ATTRIBUTE_SELECTION, new Integer(fSelection.getOffset()).toString() + " " + new Integer(fSelection.getLength()).toString()); //$NON-NLS-1$
		fArguments.put(JavaRefactoringDescriptor.ATTRIBUTE_REFERENCES, Boolean.toString(fReferences));
	}

	/**
	 * Sets the compilation unit which contains the local variable.
	 * 
	 * @param unit
	 *            the compilation unit to set
	 */
	public void setCompilationUnit(final ICompilationUnit unit) {
		Assert.isNotNull(unit);
		fUnit= unit;
	}

	/**
	 * Sets the new name to rename the local variable to.
	 * 
	 * @param name
	 *            the non-empty new name to set
	 */
	public void setNewName(final String name) {
		Assert.isNotNull(name);
		Assert.isLegal(!"".equals(name), "Name must not be empty"); //$NON-NLS-1$//$NON-NLS-2$
		fName= name;
	}

	/**
	 * Sets the selection within the compilation unit which references the local
	 * variable to rename.
	 * 
	 * @param selection
	 *            the selection to set
	 */
	public void setSelection(final ISourceRange selection) {
		Assert.isNotNull(selection);
		fSelection= selection;
	}

	/**
	 * Determines whether references to the local variable should be renamed.
	 * <p>
	 * The default is to not update references.
	 * </p>
	 * 
	 * @param update
	 *            <code>true</code> to update references, <code>false</code>
	 *            otherwise
	 */
	public void setUpdateReferences(final boolean update) {
		fReferences= update;
	}

	/**
	 * {@inheritDoc}
	 */
	public RefactoringStatus validateDescriptor() {
		RefactoringStatus status= super.validateDescriptor();
		if (fName == null || "".equals(fName)) //$NON-NLS-1$
			status.merge(RefactoringStatus.createFatalErrorStatus(DescriptorMessages.RenameResourceDescriptor_no_new_name));
		if (fUnit == null)
			status.merge(RefactoringStatus.createFatalErrorStatus(DescriptorMessages.RenameLocalVariableDescriptor_no_compilation_unit));
		if (fSelection == null)
			status.merge(RefactoringStatus.createFatalErrorStatus(DescriptorMessages.RenameLocalVariableDescriptor_no_selection));
		return status;
	}
}