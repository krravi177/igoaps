package igoaps.max;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginBo {
	@Autowired
	LoginDTO loginDTO;
	@Autowired
	LoginDAO loginDAO;
	public String checkLoginDetail(LoginBean loginBean)
	{
		String uid = loginBean.getUid();
		String pass = loginBean.getPass();
		loginDTO.setUid(uid);
		loginDTO.setPass(passEncy(pass));
		return loginDAO.loginDao(loginDTO);
	}
	
	
	private String passEncy(String pass)
	{
		 String encyPassword = null;
			try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	             md.update(pass.getBytes());
	           byte[] bytes = md.digest();
	            StringBuilder sb = new StringBuilder();
	            for(int i=0; i< bytes.length ;i++)
	            {
	                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	            }
	            encyPassword = sb.toString();
	           }
	        catch (NoSuchAlgorithmException e)
	        {
	            e.printStackTrace();
	        }
		
		
		return encyPassword;
		
	}

}
