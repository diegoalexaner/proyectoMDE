/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import concreta.diagram.edit.policies.ClaseItemSemanticEditPolicy;
import concreta.diagram.edit.policies.OpenDiagramEditPolicy;
import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ClaseEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2002;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public ClaseEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ClaseItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new ClaseFigure();
	}

	/**
	* @generated
	*/
	public ClaseFigure getPrimaryShape() {
		return (ClaseFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ClaseNombreEditPart) {
			((ClaseNombreEditPart) childEditPart).setLabel(getPrimaryShape().getFigureClaseLabelFigure());
			return true;
		}
		if (childEditPart instanceof ClaseClaseListaAtributosCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getClaseListaAtributosCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ClaseClaseListaAtributosCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ClaseClaseListaMetodosCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getClaseListaMetodosCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ClaseClaseListaMetodosCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ClaseNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof ClaseClaseListaAtributosCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getClaseListaAtributosCompartmentFigure();
			pane.remove(((ClaseClaseListaAtributosCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ClaseClaseListaMetodosCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getClaseListaMetodosCompartmentFigure();
			pane.remove(((ClaseClaseListaMetodosCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ClaseClaseListaAtributosCompartment2EditPart) {
			return getPrimaryShape().getClaseListaAtributosCompartmentFigure();
		}
		if (editPart instanceof ClaseClaseListaMetodosCompartment2EditPart) {
			return getPrimaryShape().getClaseListaMetodosCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ConcretaVisualIDRegistry.getType(ClaseNombreEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ClaseFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClaseLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fClaseListaAtributosCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fClaseListaMetodosCompartmentFigure;

		/**
		 * @generated
		 */
		public ClaseFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureClaseLabelFigure = new WrappingLabel();

			fFigureClaseLabelFigure.setText("Clase");
			fFigureClaseLabelFigure.setForegroundColor(FFIGURECLASELABELFIGURE_FORE);
			fFigureClaseLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureClaseLabelFigure);

			fClaseListaAtributosCompartmentFigure = new RectangleFigure();

			fClaseListaAtributosCompartmentFigure.setOutline(false);

			this.add(fClaseListaAtributosCompartmentFigure);

			fClaseListaMetodosCompartmentFigure = new RectangleFigure();

			fClaseListaMetodosCompartmentFigure.setOutline(false);

			this.add(fClaseListaMetodosCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClaseLabelFigure() {
			return fFigureClaseLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getClaseListaAtributosCompartmentFigure() {
			return fClaseListaAtributosCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getClaseListaMetodosCompartmentFigure() {
			return fClaseListaMetodosCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 37, 66, 86);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 173, 228, 213);

	/**
	 * @generated
	 */
	static final Color FFIGURECLASELABELFIGURE_FORE = new Color(null, 37, 66, 86);

}
