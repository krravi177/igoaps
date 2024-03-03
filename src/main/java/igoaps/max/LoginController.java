package igoaps.max;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import igoaps.location.LocationDAO;
import igoaps.location.StateBean;


@Controller
public class LoginController {
	@Autowired
	LoginBean loginBean;
	@Autowired
	LoginBo loginBo;
	@Autowired
	LocationDAO locationDAO;
	@Autowired
	RegBean regBean;
//@RequestMapping(value = "ok", method = RequestMethod.GET)
	@GetMapping("/")
	public ModelAndView openn()
	{
		return new ModelAndView("A","k",loginBean);
	}

@RequestMapping(value = "okSave", method = RequestMethod.POST)
public String loginn(@ModelAttribute("k")LoginBean loginBean,HttpSession s,ModelMap m)
{
	  String st = loginBo.checkLoginDetail(loginBean);
	System.out.println("in controlller "+st);
	  if(st.equalsIgnoreCase("success"))
	  {
		  s.setAttribute("uid", loginBean.getUid().toUpperCase());
		  m.addAttribute("k", regBean);
		  return "reg";
	  }
	  
	  else if(st.equalsIgnoreCase("ual"))
	  {
		  m.addAttribute("st", "User Already Logged");
		  return "A";
	  }
	  else
	  {
		  m.addAttribute("st", "Wrong Passward");  
	      return "A";
	  }
}
@ModelAttribute("modiList")
public List<StateBean> getStateList()
{
	
	List<StateBean> list = locationDAO.getStateList();
	return list;
}
	
}
