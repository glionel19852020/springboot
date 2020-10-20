package oauth2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleadorest")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_empleado")
	private Long id_empleado;
	
	@Column(name="nombres")
	private String nombre_empleado;
	
	@Column(name="apellidos")
	private String apellidos_empleado;
	
	@Column(name="genero")
	private String genero_empleado;
	
	@Column(name="direccion")
	private String direccion_empleado;
	
	public Empleado() {
		
				
	}
	
	public Empleado(Long id_empleado, String nombre_empleado, String apellidos_empleado, String genero_empleado, String direccion_empleado) {
		
		this.id_empleado = id_empleado;
		this.nombre_empleado = nombre_empleado;
		this.apellidos_empleado = apellidos_empleado;
		this.genero_empleado = genero_empleado;
		this.direccion_empleado = direccion_empleado;
			
		
	}

	public Long getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Long id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public String getApellidos_empleado() {
		return apellidos_empleado;
	}

	public void setApellidos_empleado(String apellidos_empleado) {
		this.apellidos_empleado = apellidos_empleado;
	}

	public String getGenero_empleado() {
		return genero_empleado;
	}

	public void setGenero_empleado(String genero_empleado) {
		this.genero_empleado = genero_empleado;
	}

	public String getDireccion_empleado() {
		return direccion_empleado;
	}

	public void setDireccion_empleado(String direccion_empleado) {
		this.direccion_empleado = direccion_empleado;
	}
	

}
