/*
 * 
 */
package concreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.AtributoNombreEditPart;
import concreta.diagram.edit.parts.ClaseNombre2EditPart;
import concreta.diagram.edit.parts.ClaseNombreEditPart;
import concreta.diagram.edit.parts.MetodoNombreEditPart;
import concreta.diagram.edit.parts.PaqueteNombreEditPart;
import concreta.diagram.edit.parts.ParametroNombreEditPart;
import concreta.diagram.parsers.MessageFormatParser;
import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser paqueteNombre_5005Parser;

	/**
	* @generated
	*/
	private IParser getPaqueteNombre_5005Parser() {
		if (paqueteNombre_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getPaquete_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paqueteNombre_5005Parser = parser;
		}
		return paqueteNombre_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser claseNombre_5006Parser;

	/**
	* @generated
	*/
	private IParser getClaseNombre_5006Parser() {
		if (claseNombre_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getClase_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claseNombre_5006Parser = parser;
		}
		return claseNombre_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser claseNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getClaseNombre_5004Parser() {
		if (claseNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getClase_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claseNombre_5004Parser = parser;
		}
		return claseNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser atributoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getAtributoNombre_5001Parser() {
		if (atributoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getAtributo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atributoNombre_5001Parser = parser;
		}
		return atributoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser metodoNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getMetodoNombre_5003Parser() {
		if (metodoNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getMetodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			metodoNombre_5003Parser = parser;
		}
		return metodoNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser parametroNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getParametroNombre_5002Parser() {
		if (parametroNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getParametro_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parametroNombre_5002Parser = parser;
		}
		return parametroNombre_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PaqueteNombreEditPart.VISUAL_ID:
			return getPaqueteNombre_5005Parser();
		case ClaseNombreEditPart.VISUAL_ID:
			return getClaseNombre_5006Parser();
		case ClaseNombre2EditPart.VISUAL_ID:
			return getClaseNombre_5004Parser();
		case AtributoNombreEditPart.VISUAL_ID:
			return getAtributoNombre_5001Parser();
		case MetodoNombreEditPart.VISUAL_ID:
			return getMetodoNombre_5003Parser();
		case ParametroNombreEditPart.VISUAL_ID:
			return getParametroNombre_5002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConcretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
