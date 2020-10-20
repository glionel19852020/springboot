package oauth2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oauth2.model.Empleado;
import oauth2.service.EmpleadoService;
import oauth2.utils.ResponseDTO;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	
	@GetMapping
	public ResponseDTO listar() {
		
		return empleadoService.findAll();
		
		
	} 
	
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Empleado empleado) {
		
		return empleadoService.create(empleado);
	
		
	}

	@PutMapping
	public ResponseDTO actualizar(@RequestBody Empleado empleado) {
		
		return empleadoService.update(empleado);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id) {
		
		 return empleadoService.delete(id);	
		
	}
	
	
}
