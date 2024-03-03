package igoaps.reg;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import igoaps.max.RegBean;

@Service
public class RegBO {
	@Autowired
	RegDTO regDTO;
	@Autowired
	RegDAO regDAO;
	public RegDTO getDetail(RegBean regBean)
	{
		BeanUtils.copyProperties(regBean, regDTO);
		
		regDTO.setName("Mr "+regBean.getName().substring(0,1).toUpperCase()+regBean.getName().substring(1).toLowerCase());
		return regDAO.saveData(regDTO);
		
		
	}
	
	
}
