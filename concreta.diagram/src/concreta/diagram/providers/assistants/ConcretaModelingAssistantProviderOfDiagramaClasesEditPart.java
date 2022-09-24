/*
 * 
 */
package concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaModelingAssistantProvider;

/**
 * @generated
 */
public class ConcretaModelingAssistantProviderOfDiagramaClasesEditPart extends ConcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretaElementTypes.Paquete_2001);
		types.add(ConcretaElementTypes.Clase_2002);
		return types;
	}

}
