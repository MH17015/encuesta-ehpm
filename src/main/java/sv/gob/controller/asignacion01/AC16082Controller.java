package sv.gob.controller.asignacion01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.PersonaEjemplo;
import sv.gob.service.asignacion01.IAC16082Service;

@Controller
public class AC16082Controller {

	@Autowired
	private IAC16082Service ac16082Service;
	
	@GetMapping("/ac16082")
	private String AC16082(Model model)
	{
		List<PersonaEjemplo> lista = ac16082Service.mostrar();
		model.addAttribute("personas",lista);
		return "asignacion01/AC16082";
	}
}
