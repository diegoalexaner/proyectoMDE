/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.MetodoCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ClaseClaseListaMetodosCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClaseClaseListaMetodosCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Clase_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Metodo_3003 == req.getElementType()) {
			return getGEFWrapper(new MetodoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
