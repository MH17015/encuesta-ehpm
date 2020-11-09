package sv.gob.service.asignacion01;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.EjemploPersona;

@Service
public class RA16069Service implements IRA16069Service {
	
	public List<EjemploPersona> lista =null;
	
	public RA16069Service() {
		lista=new LinkedList<>();
		EjemploPersona persona1=new EjemploPersona();
		persona1.setNombre("Lucy");
		persona1.setApellido("montalvo");
		persona1.setCarrera("sistemas");
		
		EjemploPersona persona2=new EjemploPersona();
		persona2.setNombre("crhistian");
		persona2.setApellido("gonzales");
		persona2.setCarrera("medicina");
		
		EjemploPersona persona3=new EjemploPersona();
		persona3.setNombre("nelson");
		persona3.setApellido("ruiz");
		persona3.setCarrera("artes");
		
		EjemploPersona persona4=new EjemploPersona();
		persona4.setNombre("kevin");
		persona4.setApellido("alegria");
		persona4.setCarrera("alimentos");
		
		lista.add(persona1);
		lista.add(persona2);
		lista.add(persona3);
		lista.add(persona4);
		
		
	}
	

	@Override
	public List<EjemploPersona> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}
	

}
