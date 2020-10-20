package oauth2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oauth2.model.Empleado;
import oauth2.repository.empleadoRepository;
import oauth2.utils.Messages;
import oauth2.utils.ResponseDTO;

@Service
public class EmpleadoService {
	
	@Autowired
	empleadoRepository emplRepository;
	
	
	public ResponseDTO findAll() {
		
		ResponseDTO res = new ResponseDTO();
		try {
			
			res.setRespuesta(emplRepository.findAll());
						
		}catch(Exception e) {
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
		}
			return res;	
	
	}
		
		
	public ResponseDTO create (Empleado empleado) {
			ResponseDTO res = new ResponseDTO();
		try {
			
			res.setRespuesta(emplRepository.save(empleado));
			
			
		}catch(Exception e) {
		
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
			
		}
		
			return res;
	}
		
	
	public ResponseDTO update (Empleado empleado) {
		ResponseDTO res = new ResponseDTO();
		
		try {
			
			if(emplRepository.existsById(empleado.getId_empleado())) {
				res.setRespuesta(emplRepository.save(empleado));
				res.setCodigo(Messages.CODE_UPDATE_SUCCES);
				res.setMensaje(Messages.MSG_UPDATE_OK);
			
			}else {
				
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);	
				
			}
			
			
		}catch (Exception e) {
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();	
			
		}
			return res;
		
		
	}
		
	
	public ResponseDTO delete(Long id) {
		ResponseDTO res =new ResponseDTO();
		try {
			
			if (emplRepository.findById(id) != null){
		
				emplRepository.deleteById(id);
				res.setCodigo(Messages.CODE_DELETE_SUCCESS);
				res.setMensaje(Messages.MSG_DELETE_OK);
			
			}else {
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);	
			}				
	
		}catch(Exception e) {
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();	
		
		}
		
		return res;
		
	}
		
		
		
	
	
	

}
