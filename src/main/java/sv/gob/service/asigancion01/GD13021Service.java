package sv.gob.service.asigancion01;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import sv.gob.models.PersonaEjemplo;

@Service
public class GD13021Service implements IGD13021Service {

	private List<PersonaEjemplo> lista = null;
	
	public GD13021Service()
	{
		lista = new LinkedList<>();
		
		PersonaEjemplo persona1 = new PersonaEjemplo();
		persona1.setNombre("Christian");
		persona1.setApellido("Galdamez");
		persona1.setCarrera("Ing. en Sistemas");
		
		PersonaEjemplo persona2 = new PersonaEjemplo();
		persona2.setNombre("Kevin");
		persona2.setApellido("Alegria");
		persona2.setCarrera("Ing. en Sistemas");
		
		PersonaEjemplo persona3 = new PersonaEjemplo();
		persona3.setNombre("Nelson");
		persona3.setApellido("Ruiz");
		persona3.setCarrera("Ing. en Sistemas");
		
		PersonaEjemplo persona4 = new PersonaEjemplo();
		persona4.setNombre("Ericka");
		persona4.setApellido("Flores");
		persona4.setCarrera("Ing. en Sistemas");
		
		lista.add(persona1);
		lista.add(persona2);
		lista.add(persona3);
		lista.add(persona4);
	}
	
	@Override
	public List<PersonaEjemplo> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}
	
}
