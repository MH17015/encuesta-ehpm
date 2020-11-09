package sv.gob.controller.asignacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.PersonaEjemplo;
import sv.gob.service.asigancion01.IGD13021Service;

@Controller
public class GD13021Controller {
	
	@Autowired
	private IGD13021Service gd13021Service;
	
	@GetMapping("/gd13021")
	private String GD13021(Model model)
	{
		List<PersonaEjemplo> lista = gd13021Service.mostrar();
		model.addAttribute("personas",lista);
		return "asignacion01/GD13021";
	}

}
