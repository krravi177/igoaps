package igoaps.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import igoaps.max.RegBean;

@Controller
public class RegController {
	@Autowired
	RegBean regBean;
	@Autowired
	RegBO regBO;
	@RequestMapping(value = "RegSave", method = RequestMethod.GET)
	public ModelAndView getData(@ModelAttribute("k")RegBean regBean)
	{
		RegDTO r = regBO.getDetail(regBean);
		if(r.getRid()>0){
			return new ModelAndView("save","h",r);
		}
		else
		{
			return new ModelAndView("E");
		}
	}

}
