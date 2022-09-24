/*
* 
*/
package concreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concreta.ConcretaPackage;
import concreta.DiagramaClases;
import concreta.diagram.edit.parts.AtributoEditPart;
import concreta.diagram.edit.parts.AtributoNombreEditPart;
import concreta.diagram.edit.parts.Clase2EditPart;
import concreta.diagram.edit.parts.ClaseClaseListaAtributosCompartment2EditPart;
import concreta.diagram.edit.parts.ClaseClaseListaAtributosCompartmentEditPart;
import concreta.diagram.edit.parts.ClaseClaseListaMetodosCompartment2EditPart;
import concreta.diagram.edit.parts.ClaseClaseListaMetodosCompartmentEditPart;
import concreta.diagram.edit.parts.ClaseEditPart;
import concreta.diagram.edit.parts.ClaseNombre2EditPart;
import concreta.diagram.edit.parts.ClaseNombreEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.DiagramaClasesEditPart;
import concreta.diagram.edit.parts.HerenciaEditPart;
import concreta.diagram.edit.parts.MetodoEditPart;
import concreta.diagram.edit.parts.MetodoMetodoListaParametrosCompartmentEditPart;
import concreta.diagram.edit.parts.MetodoNombreEditPart;
import concreta.diagram.edit.parts.PaqueteEditPart;
import concreta.diagram.edit.parts.PaqueteNombreEditPart;
import concreta.diagram.edit.parts.PaquetePaqueteListaClasesCompartmentEditPart;
import concreta.diagram.edit.parts.ParametroEditPart;
import concreta.diagram.edit.parts.ParametroNombreEditPart;
import concreta.diagram.edit.parts.RelacionEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "concreta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramaClasesEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConcretaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretaPackage.eINSTANCE.getDiagramaClases().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((DiagramaClases) domainElement)) {
			return DiagramaClasesEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!DiagramaClasesEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramaClasesEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getPaquete().isSuperTypeOf(domainElement.eClass())) {
				return PaqueteEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getClase().isSuperTypeOf(domainElement.eClass())) {
				return ClaseEditPart.VISUAL_ID;
			}
			break;
		case PaquetePaqueteListaClasesCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getClase().isSuperTypeOf(domainElement.eClass())) {
				return Clase2EditPart.VISUAL_ID;
			}
			break;
		case ClaseClaseListaAtributosCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return AtributoEditPart.VISUAL_ID;
			}
			break;
		case ClaseClaseListaMetodosCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMetodo().isSuperTypeOf(domainElement.eClass())) {
				return MetodoEditPart.VISUAL_ID;
			}
			break;
		case MetodoMetodoListaParametrosCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getParametro().isSuperTypeOf(domainElement.eClass())) {
				return ParametroEditPart.VISUAL_ID;
			}
			break;
		case ClaseClaseListaAtributosCompartment2EditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return AtributoEditPart.VISUAL_ID;
			}
			break;
		case ClaseClaseListaMetodosCompartment2EditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMetodo().isSuperTypeOf(domainElement.eClass())) {
				return MetodoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!DiagramaClasesEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramaClasesEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DiagramaClasesEditPart.VISUAL_ID:
			if (PaqueteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PaqueteEditPart.VISUAL_ID:
			if (PaqueteNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PaquetePaqueteListaClasesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaseEditPart.VISUAL_ID:
			if (ClaseNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaseClaseListaAtributosCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaseClaseListaMetodosCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clase2EditPart.VISUAL_ID:
			if (ClaseNombre2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaseClaseListaAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaseClaseListaMetodosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoEditPart.VISUAL_ID:
			if (AtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetodoEditPart.VISUAL_ID:
			if (MetodoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetodoMetodoListaParametrosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParametroEditPart.VISUAL_ID:
			if (ParametroNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PaquetePaqueteListaClasesCompartmentEditPart.VISUAL_ID:
			if (Clase2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaseClaseListaAtributosCompartmentEditPart.VISUAL_ID:
			if (AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaseClaseListaMetodosCompartmentEditPart.VISUAL_ID:
			if (MetodoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetodoMetodoListaParametrosCompartmentEditPart.VISUAL_ID:
			if (ParametroEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaseClaseListaAtributosCompartment2EditPart.VISUAL_ID:
			if (AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaseClaseListaMetodosCompartment2EditPart.VISUAL_ID:
			if (MetodoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretaPackage.eINSTANCE.getRelacion().isSuperTypeOf(domainElement.eClass())) {
			return RelacionEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getContainment().isSuperTypeOf(domainElement.eClass())) {
			return ContainmentEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getHerencia().isSuperTypeOf(domainElement.eClass())) {
			return HerenciaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(DiagramaClases element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PaquetePaqueteListaClasesCompartmentEditPart.VISUAL_ID:
		case ClaseClaseListaAtributosCompartmentEditPart.VISUAL_ID:
		case ClaseClaseListaMetodosCompartmentEditPart.VISUAL_ID:
		case MetodoMetodoListaParametrosCompartmentEditPart.VISUAL_ID:
		case ClaseClaseListaAtributosCompartment2EditPart.VISUAL_ID:
		case ClaseClaseListaMetodosCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DiagramaClasesEditPart.VISUAL_ID:
			return false;
		case AtributoEditPart.VISUAL_ID:
		case ParametroEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
