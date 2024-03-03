package igoaps.location;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistController {
 @Autowired
	LocationDAO locationDAO;
 @RequestMapping(value = "dist", method = RequestMethod.GET)
 public List<DistBean> getDistList(@ModelAttribute("stCode") String stCode)
 {
	List<DistBean> list = locationDAO.getDistList(stCode);
	return list;
 }
 
 
 @RequestMapping(value = "block", method = RequestMethod.GET)
 public  List<BlockBean> getBlockList(@ModelAttribute("distCode") String distCode)
 {
	 List<BlockBean> list = locationDAO.getBlockList(distCode);
	return list;
 }
 
}
