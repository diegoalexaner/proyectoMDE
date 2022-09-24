
/*
 * 
 */
package concreta.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createClase2CreationTool());
		paletteContainer.add(createMetodo3CreationTool());
		paletteContainer.add(createPaquete4CreationTool());
		paletteContainer.add(createParametro5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createContainment1CreationTool());
		paletteContainer.add(createHerencia2CreationTool());
		paletteContainer.add(createRelacion3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Atributo1CreationTool_title,
				Messages.Atributo1CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Atributo_3002));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Atributo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClase2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretaElementTypes.Clase_3001);
		types.add(ConcretaElementTypes.Clase_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Clase2CreationTool_title,
				Messages.Clase2CreationTool_desc, types);
		entry.setId("createClase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Clase_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMetodo3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Metodo3CreationTool_title,
				Messages.Metodo3CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Metodo_3003));
		entry.setId("createMetodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Metodo_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaquete4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Paquete4CreationTool_title,
				Messages.Paquete4CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Paquete_2001));
		entry.setId("createPaquete4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Paquete_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParametro5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parametro5CreationTool_title,
				Messages.Parametro5CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Parametro_3004));
		entry.setId("createParametro5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Parametro_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainment1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Containment1CreationTool_title,
				Messages.Containment1CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Containment_4002));
		entry.setId("createContainment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Containment_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHerencia2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Herencia2CreationTool_title,
				Messages.Herencia2CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Herencia_4003));
		entry.setId("createHerencia2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Herencia_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelacion3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Relacion3CreationTool_title,
				Messages.Relacion3CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Relacion_4001));
		entry.setId("createRelacion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Relacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
