package sv.gob.controller.asignacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.EjemploPersona;
import sv.gob.service.asignacion01.IRA16069Service;

@Controller
public class RA16069Controller {
	@Autowired
	private IRA16069Service ra16069Service;
	
	@GetMapping("/RA16069")
	private String RA16069(Model model) {
		List<EjemploPersona> lista=ra16069Service.mostrar();
		model.addAttribute("personas",lista);
		
		return "/asignacion01/RA16069(2)";
	}

}
