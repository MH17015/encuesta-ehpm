package sv.gob.service.asignacion01;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.PersonaEjemplo;

@Service
public class VA18045Service implements IVA18045Service {

	private List<PersonaEjemplo> lista= null;
  
	public VA18045Service() {
		lista = new LinkedList<>();
		
		PersonaEjemplo persona1 = new PersonaEjemplo();
		persona1.setNombre("Kevin");
		persona1.setApellido("Alegria");
		persona1.setCarrera("Ing.Sistemas");
		
		PersonaEjemplo persona2 = new PersonaEjemplo();
		persona2.setNombre("Daniel");
		persona2.setApellido("Alegria");
		persona2.setCarrera("Ing.Sistemas");
		
		PersonaEjemplo persona3 = new PersonaEjemplo();
		persona3.setNombre("Celia");
		persona3.setApellido("Bermudez");
		persona3.setCarrera("Ing.Sistemas");
		
		lista.add(persona1);
		lista.add(persona2);
		lista.add(persona3);
	}

	@Override
	public List<PersonaEjemplo> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}
 
}
