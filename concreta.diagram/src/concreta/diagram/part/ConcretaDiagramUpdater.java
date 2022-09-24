/*
* 
*/
package concreta.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concreta.Atributo;
import concreta.Clase;
import concreta.ConcretaPackage;
import concreta.Containment;
import concreta.DiagramaClases;
import concreta.Herencia;
import concreta.Metodo;
import concreta.Paquete;
import concreta.Parametro;
import concreta.Relacion;
import concreta.diagram.edit.parts.AtributoEditPart;
import concreta.diagram.edit.parts.Clase2EditPart;
import concreta.diagram.edit.parts.ClaseClaseListaAtributosCompartment2EditPart;
import concreta.diagram.edit.parts.ClaseClaseListaAtributosCompartmentEditPart;
import concreta.diagram.edit.parts.ClaseClaseListaMetodosCompartment2EditPart;
import concreta.diagram.edit.parts.ClaseClaseListaMetodosCompartmentEditPart;
import concreta.diagram.edit.parts.ClaseEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.DiagramaClasesEditPart;
import concreta.diagram.edit.parts.HerenciaEditPart;
import concreta.diagram.edit.parts.MetodoEditPart;
import concreta.diagram.edit.parts.MetodoMetodoListaParametrosCompartmentEditPart;
import concreta.diagram.edit.parts.PaqueteEditPart;
import concreta.diagram.edit.parts.PaquetePaqueteListaClasesCompartmentEditPart;
import concreta.diagram.edit.parts.ParametroEditPart;
import concreta.diagram.edit.parts.RelacionEditPart;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramaClasesEditPart.VISUAL_ID:
			return getDiagramaClases_1000SemanticChildren(view);
		case PaquetePaqueteListaClasesCompartmentEditPart.VISUAL_ID:
			return getPaquetePaqueteListaClasesCompartment_7001SemanticChildren(view);
		case ClaseClaseListaAtributosCompartmentEditPart.VISUAL_ID:
			return getClaseClaseListaAtributosCompartment_7002SemanticChildren(view);
		case ClaseClaseListaMetodosCompartmentEditPart.VISUAL_ID:
			return getClaseClaseListaMetodosCompartment_7003SemanticChildren(view);
		case MetodoMetodoListaParametrosCompartmentEditPart.VISUAL_ID:
			return getMetodoMetodoListaParametrosCompartment_7004SemanticChildren(view);
		case ClaseClaseListaAtributosCompartment2EditPart.VISUAL_ID:
			return getClaseClaseListaAtributosCompartment_7005SemanticChildren(view);
		case ClaseClaseListaMetodosCompartment2EditPart.VISUAL_ID:
			return getClaseClaseListaMetodosCompartment_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getDiagramaClases_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DiagramaClases modelElement = (DiagramaClases) view.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaPaquetes().iterator(); it.hasNext();) {
			Paquete childElement = (Paquete) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PaqueteEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListaClases().iterator(); it.hasNext();) {
			Clase childElement = (Clase) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClaseEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getPaquetePaqueteListaClasesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Paquete modelElement = (Paquete) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaClases().iterator(); it.hasNext();) {
			Clase childElement = (Clase) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Clase2EditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getClaseClaseListaAtributosCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clase modelElement = (Clase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaAtributos().iterator(); it.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AtributoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getClaseClaseListaMetodosCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clase modelElement = (Clase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaMetodos().iterator(); it.hasNext();) {
			Metodo childElement = (Metodo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MetodoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getMetodoMetodoListaParametrosCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Metodo modelElement = (Metodo) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaParametros().iterator(); it.hasNext();) {
			Parametro childElement = (Parametro) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParametroEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getClaseClaseListaAtributosCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clase modelElement = (Clase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaAtributos().iterator(); it.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AtributoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getClaseClaseListaMetodosCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clase modelElement = (Clase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaMetodos().iterator(); it.hasNext();) {
			Metodo childElement = (Metodo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MetodoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainedLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramaClasesEditPart.VISUAL_ID:
			return getDiagramaClases_1000ContainedLinks(view);
		case PaqueteEditPart.VISUAL_ID:
			return getPaquete_2001ContainedLinks(view);
		case ClaseEditPart.VISUAL_ID:
			return getClase_2002ContainedLinks(view);
		case Clase2EditPart.VISUAL_ID:
			return getClase_3001ContainedLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3002ContainedLinks(view);
		case MetodoEditPart.VISUAL_ID:
			return getMetodo_3003ContainedLinks(view);
		case ParametroEditPart.VISUAL_ID:
			return getParametro_3004ContainedLinks(view);
		case RelacionEditPart.VISUAL_ID:
			return getRelacion_4001ContainedLinks(view);
		case ContainmentEditPart.VISUAL_ID:
			return getContainment_4002ContainedLinks(view);
		case HerenciaEditPart.VISUAL_ID:
			return getHerencia_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case PaqueteEditPart.VISUAL_ID:
			return getPaquete_2001IncomingLinks(view);
		case ClaseEditPart.VISUAL_ID:
			return getClase_2002IncomingLinks(view);
		case Clase2EditPart.VISUAL_ID:
			return getClase_3001IncomingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3002IncomingLinks(view);
		case MetodoEditPart.VISUAL_ID:
			return getMetodo_3003IncomingLinks(view);
		case ParametroEditPart.VISUAL_ID:
			return getParametro_3004IncomingLinks(view);
		case RelacionEditPart.VISUAL_ID:
			return getRelacion_4001IncomingLinks(view);
		case ContainmentEditPart.VISUAL_ID:
			return getContainment_4002IncomingLinks(view);
		case HerenciaEditPart.VISUAL_ID:
			return getHerencia_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case PaqueteEditPart.VISUAL_ID:
			return getPaquete_2001OutgoingLinks(view);
		case ClaseEditPart.VISUAL_ID:
			return getClase_2002OutgoingLinks(view);
		case Clase2EditPart.VISUAL_ID:
			return getClase_3001OutgoingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3002OutgoingLinks(view);
		case MetodoEditPart.VISUAL_ID:
			return getMetodo_3003OutgoingLinks(view);
		case ParametroEditPart.VISUAL_ID:
			return getParametro_3004OutgoingLinks(view);
		case RelacionEditPart.VISUAL_ID:
			return getRelacion_4001OutgoingLinks(view);
		case ContainmentEditPart.VISUAL_ID:
			return getContainment_4002OutgoingLinks(view);
		case HerenciaEditPart.VISUAL_ID:
			return getHerencia_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getDiagramaClases_1000ContainedLinks(View view) {
		DiagramaClases modelElement = (DiagramaClases) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relacion_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Containment_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Herencia_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getPaquete_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClase_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClase_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getAtributo_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMetodo_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getParametro_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getRelacion_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getContainment_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getHerencia_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getPaquete_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClase_2002IncomingLinks(View view) {
		Clase modelElement = (Clase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Containment_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Herencia_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClase_3001IncomingLinks(View view) {
		Clase modelElement = (Clase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Containment_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Herencia_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getAtributo_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMetodo_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getParametro_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getRelacion_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getContainment_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getHerencia_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getPaquete_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClase_2002OutgoingLinks(View view) {
		Clase modelElement = (Clase) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Containment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Herencia_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClase_3001OutgoingLinks(View view) {
		Clase modelElement = (Clase) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Containment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Herencia_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getAtributo_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMetodo_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getParametro_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getRelacion_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getContainment_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getHerencia_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Relacion_4001(
			DiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (RelacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase dst = link.getTarget();
			Clase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Relacion_4001,
					RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Containment_4002(
			DiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesContaiment().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Containment) {
				continue;
			}
			Containment link = (Containment) linkObject;
			if (ContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase dst = link.getTarget();
			Clase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Containment_4002,
					ContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Herencia_4003(
			DiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesHerencia().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Herencia) {
				continue;
			}
			Herencia link = (Herencia) linkObject;
			if (HerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase dst = link.getTarget();
			Clase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Herencia_4003,
					HerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Relacion_4001(Clase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getRelacion_Target()
					|| false == setting.getEObject() instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) setting.getEObject();
			if (RelacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Relacion_4001,
					RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Containment_4002(Clase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getContainment_Target()
					|| false == setting.getEObject() instanceof Containment) {
				continue;
			}
			Containment link = (Containment) setting.getEObject();
			if (ContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Containment_4002,
					ContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Herencia_4003(Clase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getHerencia_Target()
					|| false == setting.getEObject() instanceof Herencia) {
				continue;
			}
			Herencia link = (Herencia) setting.getEObject();
			if (HerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Herencia_4003,
					HerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Relacion_4001(Clase source) {
		DiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramaClases) {
				container = (DiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (RelacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase dst = link.getTarget();
			Clase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Relacion_4001,
					RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Containment_4002(Clase source) {
		DiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramaClases) {
				container = (DiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesContaiment().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Containment) {
				continue;
			}
			Containment link = (Containment) linkObject;
			if (ContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase dst = link.getTarget();
			Clase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Containment_4002,
					ContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Herencia_4003(Clase source) {
		DiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramaClases) {
				container = (DiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesHerencia().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Herencia) {
				continue;
			}
			Herencia link = (Herencia) linkObject;
			if (HerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clase dst = link.getTarget();
			Clase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Herencia_4003,
					HerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
			return ConcretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getContainedLinks(View view) {
			return ConcretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
			return ConcretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
			return ConcretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
