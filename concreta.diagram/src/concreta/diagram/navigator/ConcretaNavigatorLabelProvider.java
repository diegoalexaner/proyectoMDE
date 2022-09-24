/*
* 
*/
package concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import concreta.Containment;
import concreta.DiagramaClases;
import concreta.Relacion;
import concreta.diagram.edit.parts.AtributoEditPart;
import concreta.diagram.edit.parts.AtributoNombreEditPart;
import concreta.diagram.edit.parts.Clase2EditPart;
import concreta.diagram.edit.parts.ClaseEditPart;
import concreta.diagram.edit.parts.ClaseNombre2EditPart;
import concreta.diagram.edit.parts.ClaseNombreEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.DiagramaClasesEditPart;
import concreta.diagram.edit.parts.HerenciaEditPart;
import concreta.diagram.edit.parts.MetodoEditPart;
import concreta.diagram.edit.parts.MetodoNombreEditPart;
import concreta.diagram.edit.parts.PaqueteEditPart;
import concreta.diagram.edit.parts.PaqueteNombreEditPart;
import concreta.diagram.edit.parts.ParametroEditPart;
import concreta.diagram.edit.parts.ParametroNombreEditPart;
import concreta.diagram.edit.parts.RelacionEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaParserProvider;

/**
 * @generated
 */
public class ConcretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcretaNavigatorItem && !isOwnView(((ConcretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return ConcretaDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramaClasesEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?concreta?DiagramaClases", ConcretaElementTypes.DiagramaClases_1000); //$NON-NLS-1$
		case PaqueteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concreta?Paquete", ConcretaElementTypes.Paquete_2001); //$NON-NLS-1$
		case ClaseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concreta?Clase", ConcretaElementTypes.Clase_2002); //$NON-NLS-1$
		case Clase2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?Clase", ConcretaElementTypes.Clase_3001); //$NON-NLS-1$
		case AtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?Atributo", ConcretaElementTypes.Atributo_3002); //$NON-NLS-1$
		case MetodoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?Metodo", ConcretaElementTypes.Metodo_3003); //$NON-NLS-1$
		case ParametroEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?Parametro", ConcretaElementTypes.Parametro_3004); //$NON-NLS-1$
		case RelacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?Relacion", ConcretaElementTypes.Relacion_4001); //$NON-NLS-1$
		case ContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?Containment", ConcretaElementTypes.Containment_4002); //$NON-NLS-1$
		case HerenciaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?Herencia", ConcretaElementTypes.Herencia_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcretaDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcretaElementTypes.isKnownElementType(elementType)) {
			image = ConcretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramaClasesEditPart.VISUAL_ID:
			return getDiagramaClases_1000Text(view);
		case PaqueteEditPart.VISUAL_ID:
			return getPaquete_2001Text(view);
		case ClaseEditPart.VISUAL_ID:
			return getClase_2002Text(view);
		case Clase2EditPart.VISUAL_ID:
			return getClase_3001Text(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3002Text(view);
		case MetodoEditPart.VISUAL_ID:
			return getMetodo_3003Text(view);
		case ParametroEditPart.VISUAL_ID:
			return getParametro_3004Text(view);
		case RelacionEditPart.VISUAL_ID:
			return getRelacion_4001Text(view);
		case ContainmentEditPart.VISUAL_ID:
			return getContainment_4002Text(view);
		case HerenciaEditPart.VISUAL_ID:
			return getHerencia_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDiagramaClases_1000Text(View view) {
		DiagramaClases domainModelElement = (DiagramaClases) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaquete_2001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Paquete_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(PaqueteNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClase_2002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Clase_2002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(ClaseNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClase_3001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Clase_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(ClaseNombre2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributo_3002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Atributo_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(AtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMetodo_3003Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Metodo_3003,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MetodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParametro_3004Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Parametro_3004,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(ParametroNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelacion_4001Text(View view) {
		Relacion domainModelElement = (Relacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getMultiplicidadA();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainment_4002Text(View view) {
		Containment domainModelElement = (Containment) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getMultiplicidadA();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHerencia_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return DiagramaClasesEditPart.MODEL_ID.equals(ConcretaVisualIDRegistry.getModelID(view));
	}

}
