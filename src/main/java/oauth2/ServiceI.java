package oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceI {
	
	
	@GetMapping("/holamundo")
	public String holaprogramacion() {
		
		return "Hola mundo desde Springboot";
		
	}

}
