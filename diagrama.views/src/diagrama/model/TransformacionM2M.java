package diagrama.model;

import javax.swing.JOptionPane;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import abstracta.*;
import concreta.*;

public class TransformacionM2M{

	private ModelFactory modelFactoryConcreta;
	private ModelFactoryAbstracta modelFactoryAbstracta;

	public TransformacionM2M(ModelFactory modelFactoryConcreta, ModelFactoryAbstracta modelFactoryAbstracta) {
		super();
		this.modelFactoryConcreta = modelFactoryConcreta;
		this.modelFactoryAbstracta= modelFactoryAbstracta;
	}

	public void transformaModel2Model() {
		for (DiagramaClases diagrama : modelFactoryConcreta.getListaDiagramasClases()){
			crearPaquetesAbstracta(diagrama);
			crearClasesAbstracta(diagrama);
			crearRelacionesAbstracta(diagrama);
		}
	}
	
	private void crearPaquetesAbstracta(DiagramaClases diagrama) {
		for (Paquete paquete : diagrama.getListaPaquetes()){
			PaqueteAbstracta paqueteAbstracta = AbstractaFactory.eINSTANCE.createPaqueteAbstracta();
			paqueteAbstracta.setNombre(paquete.getNombre());
			paqueteAbstracta.setRuta(paquete.getRuta());
			modelFactoryAbstracta.getListaPaquetes().get(0).getListaPaquetes().add(paqueteAbstracta);

		}
	}

	private void crearClasesAbstracta(DiagramaClases diagrama) {
		for (Clase clase : diagrama.getListaClases()){
			ClaseAbstracta claseAbstracta = AbstractaFactory.eINSTANCE.createClaseAbstracta();
			claseAbstracta.setNombre(clase.getNombre());
			claseAbstracta.setRuta(clase.getRuta());

			for (Atributo atributo : clase.getListaAtributos()) {
				AtributoAbstracta atributoAbstracta= AbstractaFactory.eINSTANCE.createAtributoAbstracta();
				atributoAbstracta.setNombre(atributo.getNombre());
				claseAbstracta.getListaAtributos().add(atributoAbstracta);
			}

			for (Metodo metodo : clase.getListaMetodos()) {
				MetodoAbstracta metodoAbstracta = AbstractaFactory.eINSTANCE.createMetodoAbstracta();
				metodoAbstracta.setNombre(metodo.getNombre());
				metodoAbstracta.setSentencias(metodo.getSentencia());
				metodoAbstracta.setValorRetorno(metodo.getValorRetorno());				
				claseAbstracta.getListaMetodos().add(metodoAbstracta);
				
				if(metodo.getListaParametros().size()!=0) {
					for(Parametro parametro: metodo.getListaParametros()) {
						ParametroAbstracta parametroAbstracta = AbstractaFactory.eINSTANCE.createParametroAbstracta();
						parametroAbstracta.setNombre(parametro.getNombre());
						metodoAbstracta.getListaParametros().add(parametroAbstracta);
					}
				}
								
			}
			modelFactoryAbstracta.getListaPaquetes().get(0).getListaClases().add(claseAbstracta);
		}		
	}
	
	private void crearRelacionesAbstracta(DiagramaClases diagrama) {

		for(Relacion relacion: diagrama.getListaRelaciones()) {
			Clase source = relacion.getSource();
			Clase target = relacion.getTarget();

			ClaseAbstracta claseAbstractaSource = obtenerClase(source.getNombre());
			ClaseAbstracta claseAbstractaTarget = obtenerClase(target.getNombre());

			RelacionAbstracta relacionAbstractaSource=AbstractaFactory.eINSTANCE.createRelacionAbstracta();
			relacionAbstractaSource.setRolA(relacion.getRolA());
			relacionAbstractaSource.setRolB(relacion.getRolB());
			relacionAbstractaSource.setSource(claseAbstractaSource);
			relacionAbstractaSource.setTarget(claseAbstractaTarget);
			relacionAbstractaSource.setMultiplicidadA(relacion.getMultiplicidadA());
			relacionAbstractaSource.setMultiplicidadB(relacion.getMultiplicidadB());
			
			claseAbstractaSource.getListaRelaciones().add(relacionAbstractaSource);

			RelacionAbstracta relacionAbstractaTarget=AbstractaFactory.eINSTANCE.createRelacionAbstracta();
			relacionAbstractaTarget.setRolA(relacion.getRolB());
			relacionAbstractaTarget.setRolB(relacion.getRolA());
			relacionAbstractaTarget.setSource(claseAbstractaTarget); 
			relacionAbstractaTarget.setTarget(claseAbstractaSource);
			relacionAbstractaTarget.setMultiplicidadA(relacion.getMultiplicidadB());
			relacionAbstractaTarget.setMultiplicidadB(relacion.getMultiplicidadA());
			
			claseAbstractaTarget.getListaRelaciones().add(relacionAbstractaTarget);
		}
		
		for(Containment relacionCont: diagrama.getListaRelacionesContaiment()){
			
			Clase source = relacionCont.getSource();
			Clase target = relacionCont.getTarget();

			ClaseAbstracta claseAbstractaSource = obtenerClase(source.getNombre());
			ClaseAbstracta claseAbstractaTarget = obtenerClase(target.getNombre());

			ContainmentAbstracta relacionAbstractaSource = AbstractaFactory.eINSTANCE.createContainmentAbstracta();
			relacionAbstractaSource.setRolA(relacionCont.getRolA());
			relacionAbstractaSource.setRolB(relacionCont.getRolB());
			relacionAbstractaSource.setSource(claseAbstractaSource);
			relacionAbstractaSource.setTarget(claseAbstractaTarget);
			relacionAbstractaSource.setMultiplicidadA(relacionCont.getMultiplicidadA());
			relacionAbstractaSource.setMultiplicidadB(relacionCont.getMultiplicidadB());
			claseAbstractaSource.getListaRelacionesContaiment().add(relacionAbstractaSource);

			ContainmentAbstracta relacionAbstractaTarget=AbstractaFactory.eINSTANCE.createContainmentAbstracta();
			relacionAbstractaTarget.setRolA(relacionCont.getRolB());
			relacionAbstractaTarget.setRolB(relacionCont.getRolA());
			relacionAbstractaTarget.setSource(claseAbstractaTarget); 
			relacionAbstractaTarget.setTarget(claseAbstractaSource);
			relacionAbstractaTarget.setMultiplicidadA(relacionCont.getMultiplicidadB());
			relacionAbstractaTarget.setMultiplicidadB(relacionCont.getMultiplicidadA());
			claseAbstractaTarget.getListaRelacionesContaiment().add(relacionAbstractaTarget);

		}
		for(Herencia relacionHere: diagrama.getListaRelacionesHerencia()) {
			Clase source = relacionHere.getSource();
			Clase target = relacionHere.getTarget();

			ClaseAbstracta claseAbstractaSource = obtenerClase(source.getNombre());
			ClaseAbstracta claseAbstractaTarget = obtenerClase(target.getNombre());

			HerenciaAbstracta relacionAbstractaSource= AbstractaFactory.eINSTANCE.createHerenciaAbstracta();
			relacionAbstractaSource.setSource(claseAbstractaSource);
			relacionAbstractaSource.setTarget(claseAbstractaTarget);
			claseAbstractaSource.getListaRelacionesHerencia().add(relacionAbstractaSource);

			HerenciaAbstracta relacionAbstractaTarget=AbstractaFactory.eINSTANCE.createHerenciaAbstracta();
			relacionAbstractaTarget.setSource(claseAbstractaSource); 
			relacionAbstractaTarget.setTarget(claseAbstractaTarget);
			claseAbstractaTarget.getListaRelacionesHerencia().add(relacionAbstractaTarget);
		}
	}
	

	private ClaseAbstracta obtenerClase(String nombre) {
		PaqueteAbstracta paqueteAbstractaRoot = modelFactoryAbstracta.getListaPaquetes().get(0);
		for (ClaseAbstracta claseAbstracta : paqueteAbstractaRoot.getListaClases()){
			if(claseAbstracta.getNombre().equals(nombre)) {
				return claseAbstracta;
			}		
		}
		return null;
	}

	
}
