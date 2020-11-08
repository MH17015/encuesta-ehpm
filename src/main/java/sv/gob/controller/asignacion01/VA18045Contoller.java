package sv.gob.controller.asignacion01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.PersonaEjemplo;
import sv.gob.service.asignacion01.IVA18045Service;

@Controller
public class VA18045Contoller {

	@Autowired
	private IVA18045Service va18045Service;
	
	@GetMapping("/VA18045")
	private String VA18045(Model model) {
		List<PersonaEjemplo> lista = va18045Service.mostrar();
		model.addAttribute("personas",lista);
		return "asignacion01/VA18045";
	}
}
