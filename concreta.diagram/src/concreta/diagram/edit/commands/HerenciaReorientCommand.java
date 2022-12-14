/*
 * 
 */
package concreta.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import concreta.Clase;
import concreta.DiagramaClases;
import concreta.Herencia;
import concreta.diagram.edit.policies.ConcretaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class HerenciaReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public HerenciaReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Herencia) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Clase && newEnd instanceof Clase)) {
			return false;
		}
		Clase target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof DiagramaClases)) {
			return false;
		}
		DiagramaClases container = (DiagramaClases) getLink().eContainer();
		return ConcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistHerencia_4003(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Clase && newEnd instanceof Clase)) {
			return false;
		}
		Clase source = getLink().getSource();
		if (!(getLink().eContainer() instanceof DiagramaClases)) {
			return false;
		}
		DiagramaClases container = (DiagramaClases) getLink().eContainer();
		return ConcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistHerencia_4003(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Herencia getLink() {
		return (Herencia) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Clase getOldSource() {
		return (Clase) oldEnd;
	}

	/**
	* @generated
	*/
	protected Clase getNewSource() {
		return (Clase) newEnd;
	}

	/**
	* @generated
	*/
	protected Clase getOldTarget() {
		return (Clase) oldEnd;
	}

	/**
	* @generated
	*/
	protected Clase getNewTarget() {
		return (Clase) newEnd;
	}
}
