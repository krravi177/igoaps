package igoaps.max;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	@Autowired
	LoginInterface loginInterface;
	public String loginDao(LoginDTO loginDTO)
	{
		//LoginDTO p = loginInterface.findOne(loginDTO.getUid());
		
	LoginDTO p = loginInterface.getLoginDTOByUid(loginDTO.getUid());
		
	if(loginDTO.getPass().equalsIgnoreCase(p.getPass()))
	{
		  if(p.getStatus().equalsIgnoreCase("Y"))
		  {
			  return "success";
		  }
		  else
		  {
			  return "ual";
		  }
	}
	else
	{
		return "wpass";
	}
	
	}

}
