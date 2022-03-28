package ar.com.eldars;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
	@GetMapping("/")
	public String inicio() {
		log.info("ejecutando controlador rest");
                log.debug("mas detalles del controlador");
		return "Hola Mundo con Spring 4";
	}
}
