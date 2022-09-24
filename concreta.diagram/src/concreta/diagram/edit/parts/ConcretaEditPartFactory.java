/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcretaVisualIDRegistry.getVisualID(view)) {

			case DiagramaClasesEditPart.VISUAL_ID:
				return new DiagramaClasesEditPart(view);

			case PaqueteEditPart.VISUAL_ID:
				return new PaqueteEditPart(view);

			case PaqueteNombreEditPart.VISUAL_ID:
				return new PaqueteNombreEditPart(view);

			case ClaseEditPart.VISUAL_ID:
				return new ClaseEditPart(view);

			case ClaseNombreEditPart.VISUAL_ID:
				return new ClaseNombreEditPart(view);

			case Clase2EditPart.VISUAL_ID:
				return new Clase2EditPart(view);

			case ClaseNombre2EditPart.VISUAL_ID:
				return new ClaseNombre2EditPart(view);

			case AtributoEditPart.VISUAL_ID:
				return new AtributoEditPart(view);

			case AtributoNombreEditPart.VISUAL_ID:
				return new AtributoNombreEditPart(view);

			case MetodoEditPart.VISUAL_ID:
				return new MetodoEditPart(view);

			case MetodoNombreEditPart.VISUAL_ID:
				return new MetodoNombreEditPart(view);

			case ParametroEditPart.VISUAL_ID:
				return new ParametroEditPart(view);

			case ParametroNombreEditPart.VISUAL_ID:
				return new ParametroNombreEditPart(view);

			case PaquetePaqueteListaClasesCompartmentEditPart.VISUAL_ID:
				return new PaquetePaqueteListaClasesCompartmentEditPart(view);

			case ClaseClaseListaAtributosCompartmentEditPart.VISUAL_ID:
				return new ClaseClaseListaAtributosCompartmentEditPart(view);

			case ClaseClaseListaMetodosCompartmentEditPart.VISUAL_ID:
				return new ClaseClaseListaMetodosCompartmentEditPart(view);

			case MetodoMetodoListaParametrosCompartmentEditPart.VISUAL_ID:
				return new MetodoMetodoListaParametrosCompartmentEditPart(view);

			case ClaseClaseListaAtributosCompartment2EditPart.VISUAL_ID:
				return new ClaseClaseListaAtributosCompartment2EditPart(view);

			case ClaseClaseListaMetodosCompartment2EditPart.VISUAL_ID:
				return new ClaseClaseListaMetodosCompartment2EditPart(view);

			case RelacionEditPart.VISUAL_ID:
				return new RelacionEditPart(view);

			case ContainmentEditPart.VISUAL_ID:
				return new ContainmentEditPart(view);

			case HerenciaEditPart.VISUAL_ID:
				return new HerenciaEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
