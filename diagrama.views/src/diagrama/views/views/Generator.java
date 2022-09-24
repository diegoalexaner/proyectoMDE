package diagrama.views.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import diagrama.model.ModelFactoryModel;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class Generator extends ViewPart {
	public Generator() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "diagrama.views.views.Generator";


	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(null);
		
		Group grpGeneracionDeModelo = new Group(parent, SWT.NONE);
		grpGeneracionDeModelo.setText("Generacion de Modelo a modelo");
		grpGeneracionDeModelo.setBounds(10, 21, 546, 82);
		
		Button btnGeneradorMm = new Button(grpGeneracionDeModelo, SWT.NONE);
		btnGeneradorMm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm= ModelFactoryModel.getInstance();
				mfm.transformarModelToModel();
			}
		});
		btnGeneradorMm.setBounds(197, 29, 109, 25);
		btnGeneradorMm.setText("Generador M2M");
		
		Group grpGeneracionDeModelo_2 = new Group(parent, SWT.NONE);
		grpGeneracionDeModelo_2.setText("Generacion de Modelo a texto");
		grpGeneracionDeModelo_2.setBounds(10, 137, 546, 82);
		
		Button btnGeneradorMt = new Button(grpGeneracionDeModelo_2, SWT.NONE);
		btnGeneradorMt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm= ModelFactoryModel.getInstance();
				mfm.transformarModelToText();

			}
		});
		btnGeneradorMt.setText("Generador M2T");
		btnGeneradorMt.setBounds(197, 29, 109, 25);
	
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
}
