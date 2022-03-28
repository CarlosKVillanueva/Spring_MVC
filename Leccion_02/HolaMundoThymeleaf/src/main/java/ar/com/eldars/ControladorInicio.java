package ar.com.eldars;

import ar.com.eldars.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
        @Value("${index.saludo}")
        private String saludo;
    
	@GetMapping("/")
	public String inicio(Model model) {
            var mensaje = "Hola Mundo con Thymeleaf a traves de Model";
           
            Persona persona = new Persona();
            persona.setNombre("Kaio");
            persona.setApellido("Villanueva");
            persona.setEmail("carloskvillanueva@gmail.com");
            persona.setTelefono("1169965241");
            
            Persona persona1 = new Persona();
            persona1.setNombre("Juan");
            persona1.setApellido("Villanueva");
            persona1.setEmail("juanvillanueva@gmail.com");
            persona1.setTelefono("1189456709");
            
            ArrayList<Persona> personas = new ArrayList<>();
            personas.add(persona);
            personas.add(persona1);
            
		log.info("ejecutando controlador Spring MVC");
                model.addAttribute("mensaje", mensaje);
                model.addAttribute("saludo", saludo);
                //model.addAttribute("persona", persona);
                model.addAttribute("personas", personas);
                
		return "index";
	}
}
