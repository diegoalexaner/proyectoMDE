/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import concreta.diagram.edit.commands.ClaseCreateCommand;
import concreta.diagram.edit.commands.PaqueteCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class DiagramaClasesItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DiagramaClasesItemSemanticEditPolicy() {
		super(ConcretaElementTypes.DiagramaClases_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Paquete_2001 == req.getElementType()) {
			return getGEFWrapper(new PaqueteCreateCommand(req));
		}
		if (ConcretaElementTypes.Clase_2002 == req.getElementType()) {
			return getGEFWrapper(new ClaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
