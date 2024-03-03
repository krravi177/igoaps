package igoaps.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegDAO {
	@Autowired
	RegIterface regIterface;
	public RegDTO saveData(RegDTO regDTO)
	{
	 return regIterface.save(regDTO);
		
		
		
	}
	
}
