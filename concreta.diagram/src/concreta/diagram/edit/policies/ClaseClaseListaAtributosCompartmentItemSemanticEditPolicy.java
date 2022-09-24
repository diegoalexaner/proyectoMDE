/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.AtributoCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ClaseClaseListaAtributosCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClaseClaseListaAtributosCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Clase_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Atributo_3002 == req.getElementType()) {
			return getGEFWrapper(new AtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
