/*
* 
*/
package concreta.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.part.Messages;

/**
 * @generated
 */
public class ConcretaNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ConcretaNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ConcretaNavigatorItem> result = new ArrayList<ConcretaNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, DiagramaClasesEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {

		case DiagramaClasesEditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ConcretaNavigatorGroup links = new ConcretaNavigatorGroup(
					Messages.NavigatorGroupName_DiagramaClases_1000_links, "icons/linksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(PaqueteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(RelacionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ContainmentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(HerenciaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case PaqueteEditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(PaquetePaqueteListaClasesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcretaVisualIDRegistry.getType(Clase2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ClaseEditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			ConcretaNavigatorGroup incominglinks = new ConcretaNavigatorGroup(
					Messages.NavigatorGroupName_Clase_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcretaNavigatorGroup outgoinglinks = new ConcretaNavigatorGroup(
					Messages.NavigatorGroupName_Clase_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseClaseListaAtributosCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcretaVisualIDRegistry.getType(AtributoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseClaseListaMetodosCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcretaVisualIDRegistry.getType(MetodoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ContainmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ContainmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(HerenciaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(HerenciaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Clase2EditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			ConcretaNavigatorGroup incominglinks = new ConcretaNavigatorGroup(
					Messages.NavigatorGroupName_Clase_3001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcretaNavigatorGroup outgoinglinks = new ConcretaNavigatorGroup(
					Messages.NavigatorGroupName_Clase_3001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseClaseListaAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcretaVisualIDRegistry.getType(AtributoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseClaseListaMetodosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcretaVisualIDRegistry.getType(MetodoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ContainmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ContainmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(HerenciaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(HerenciaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MetodoEditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(MetodoMetodoListaParametrosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcretaVisualIDRegistry.getType(ParametroEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case RelacionEditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcretaNavigatorGroup target = new ConcretaNavigatorGroup(Messages.NavigatorGroupName_Relacion_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ConcretaNavigatorGroup source = new ConcretaNavigatorGroup(Messages.NavigatorGroupName_Relacion_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(Clase2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(Clase2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ContainmentEditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcretaNavigatorGroup target = new ConcretaNavigatorGroup(
					Messages.NavigatorGroupName_Containment_4002_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcretaNavigatorGroup source = new ConcretaNavigatorGroup(
					Messages.NavigatorGroupName_Containment_4002_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(Clase2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(Clase2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HerenciaEditPart.VISUAL_ID: {
			LinkedList<ConcretaAbstractNavigatorItem> result = new LinkedList<ConcretaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcretaNavigatorGroup target = new ConcretaNavigatorGroup(Messages.NavigatorGroupName_Herencia_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ConcretaNavigatorGroup source = new ConcretaNavigatorGroup(Messages.NavigatorGroupName_Herencia_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(Clase2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(ClaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcretaVisualIDRegistry.getType(Clase2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DiagramaClasesEditPart.MODEL_ID.equals(ConcretaVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ConcretaNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<ConcretaNavigatorItem> result = new ArrayList<ConcretaNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new ConcretaNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ConcretaNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ConcretaAbstractNavigatorItem) {
			ConcretaAbstractNavigatorItem abstractNavigatorItem = (ConcretaAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
