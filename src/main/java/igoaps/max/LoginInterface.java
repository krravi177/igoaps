package igoaps.max;

import org.springframework.data.repository.CrudRepository;

public interface LoginInterface extends CrudRepository<LoginDTO, String> {

	LoginDTO getLoginDTOByUid(String uid);
	LoginDTO getLoginDTOByUid(String uid,String pass);
	LoginDTO getLoginDTOByUid(String uid,String pass,String status);
	
}
