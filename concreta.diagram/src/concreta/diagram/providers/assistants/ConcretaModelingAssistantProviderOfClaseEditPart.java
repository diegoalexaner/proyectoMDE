/*
 * 
 */
package concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concreta.diagram.edit.parts.Clase2EditPart;
import concreta.diagram.edit.parts.ClaseEditPart;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaModelingAssistantProvider;

/**
 * @generated
 */
public class ConcretaModelingAssistantProviderOfClaseEditPart extends ConcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClaseEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClaseEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ConcretaElementTypes.Relacion_4001);
		types.add(ConcretaElementTypes.Containment_4002);
		types.add(ConcretaElementTypes.Herencia_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClaseEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClaseEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClaseEditPart) {
			types.add(ConcretaElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof Clase2EditPart) {
			types.add(ConcretaElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof ClaseEditPart) {
			types.add(ConcretaElementTypes.Containment_4002);
		}
		if (targetEditPart instanceof Clase2EditPart) {
			types.add(ConcretaElementTypes.Containment_4002);
		}
		if (targetEditPart instanceof ClaseEditPart) {
			types.add(ConcretaElementTypes.Herencia_4003);
		}
		if (targetEditPart instanceof Clase2EditPart) {
			types.add(ConcretaElementTypes.Herencia_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClaseEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClaseEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretaElementTypes.Relacion_4001) {
			types.add(ConcretaElementTypes.Clase_2002);
			types.add(ConcretaElementTypes.Clase_3001);
		} else if (relationshipType == ConcretaElementTypes.Containment_4002) {
			types.add(ConcretaElementTypes.Clase_2002);
			types.add(ConcretaElementTypes.Clase_3001);
		} else if (relationshipType == ConcretaElementTypes.Herencia_4003) {
			types.add(ConcretaElementTypes.Clase_2002);
			types.add(ConcretaElementTypes.Clase_3001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClaseEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClaseEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ConcretaElementTypes.Relacion_4001);
		types.add(ConcretaElementTypes.Containment_4002);
		types.add(ConcretaElementTypes.Herencia_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ClaseEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClaseEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretaElementTypes.Relacion_4001) {
			types.add(ConcretaElementTypes.Clase_2002);
			types.add(ConcretaElementTypes.Clase_3001);
		} else if (relationshipType == ConcretaElementTypes.Containment_4002) {
			types.add(ConcretaElementTypes.Clase_2002);
			types.add(ConcretaElementTypes.Clase_3001);
		} else if (relationshipType == ConcretaElementTypes.Herencia_4003) {
			types.add(ConcretaElementTypes.Clase_2002);
			types.add(ConcretaElementTypes.Clase_3001);
		}
		return types;
	}

}
