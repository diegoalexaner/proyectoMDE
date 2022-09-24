/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.ParametroCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class MetodoMetodoListaParametrosCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MetodoMetodoListaParametrosCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Metodo_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Parametro_3004 == req.getElementType()) {
			return getGEFWrapper(new ParametroCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
