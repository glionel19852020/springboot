package oauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oauth2.model.Empleado;

@Repository
public interface empleadoRepository extends JpaRepository<Empleado, Long> {

		
	
	
	
}
