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
public class ClaseClaseListaAtributosCompartment2ItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClaseClaseListaAtributosCompartment2ItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Clase_2002);
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
