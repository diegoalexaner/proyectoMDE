/*
 * 
 */
package concreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.AtributoEditPart;
import concreta.diagram.edit.parts.Clase2EditPart;
import concreta.diagram.edit.parts.ClaseEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.DiagramaClasesEditPart;
import concreta.diagram.edit.parts.HerenciaEditPart;
import concreta.diagram.edit.parts.MetodoEditPart;
import concreta.diagram.edit.parts.PaqueteEditPart;
import concreta.diagram.edit.parts.ParametroEditPart;
import concreta.diagram.edit.parts.RelacionEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class ConcretaElementTypes {

	/**
	* @generated
	*/
	private ConcretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConcretaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType DiagramaClases_1000 = getElementType("concreta.diagram.DiagramaClases_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Paquete_2001 = getElementType("concreta.diagram.Paquete_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clase_2002 = getElementType("concreta.diagram.Clase_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clase_3001 = getElementType("concreta.diagram.Clase_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Atributo_3002 = getElementType("concreta.diagram.Atributo_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Metodo_3003 = getElementType("concreta.diagram.Metodo_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parametro_3004 = getElementType("concreta.diagram.Parametro_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Relacion_4001 = getElementType("concreta.diagram.Relacion_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Containment_4002 = getElementType("concreta.diagram.Containment_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Herencia_4003 = getElementType("concreta.diagram.Herencia_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DiagramaClases_1000, ConcretaPackage.eINSTANCE.getDiagramaClases());

			elements.put(Paquete_2001, ConcretaPackage.eINSTANCE.getPaquete());

			elements.put(Clase_2002, ConcretaPackage.eINSTANCE.getClase());

			elements.put(Clase_3001, ConcretaPackage.eINSTANCE.getClase());

			elements.put(Atributo_3002, ConcretaPackage.eINSTANCE.getAtributo());

			elements.put(Metodo_3003, ConcretaPackage.eINSTANCE.getMetodo());

			elements.put(Parametro_3004, ConcretaPackage.eINSTANCE.getParametro());

			elements.put(Relacion_4001, ConcretaPackage.eINSTANCE.getRelacion());

			elements.put(Containment_4002, ConcretaPackage.eINSTANCE.getContainment());

			elements.put(Herencia_4003, ConcretaPackage.eINSTANCE.getHerencia());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DiagramaClases_1000);
			KNOWN_ELEMENT_TYPES.add(Paquete_2001);
			KNOWN_ELEMENT_TYPES.add(Clase_2002);
			KNOWN_ELEMENT_TYPES.add(Clase_3001);
			KNOWN_ELEMENT_TYPES.add(Atributo_3002);
			KNOWN_ELEMENT_TYPES.add(Metodo_3003);
			KNOWN_ELEMENT_TYPES.add(Parametro_3004);
			KNOWN_ELEMENT_TYPES.add(Relacion_4001);
			KNOWN_ELEMENT_TYPES.add(Containment_4002);
			KNOWN_ELEMENT_TYPES.add(Herencia_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramaClasesEditPart.VISUAL_ID:
			return DiagramaClases_1000;
		case PaqueteEditPart.VISUAL_ID:
			return Paquete_2001;
		case ClaseEditPart.VISUAL_ID:
			return Clase_2002;
		case Clase2EditPart.VISUAL_ID:
			return Clase_3001;
		case AtributoEditPart.VISUAL_ID:
			return Atributo_3002;
		case MetodoEditPart.VISUAL_ID:
			return Metodo_3003;
		case ParametroEditPart.VISUAL_ID:
			return Parametro_3004;
		case RelacionEditPart.VISUAL_ID:
			return Relacion_4001;
		case ContainmentEditPart.VISUAL_ID:
			return Containment_4002;
		case HerenciaEditPart.VISUAL_ID:
			return Herencia_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return concreta.diagram.providers.ConcretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return concreta.diagram.providers.ConcretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return concreta.diagram.providers.ConcretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
