/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.Clase2CreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class PaquetePaqueteListaClasesCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PaquetePaqueteListaClasesCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Paquete_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Clase_3001 == req.getElementType()) {
			return getGEFWrapper(new Clase2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
