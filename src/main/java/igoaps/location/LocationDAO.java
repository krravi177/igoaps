package igoaps.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDAO {
@Autowired
	StateInterface stateInterface;
@Autowired
DistInterface distInterface;
@Autowired
BlockInterface blockInterface;


  public List<BlockBean> getBlockList(String distCode)
  {
	 return blockInterface.getBlockBeanListByDistCode(distCode);
  }

	public List<StateBean> getStateList()
	{
		List<StateBean> list = (List<StateBean>)stateInterface.findAll();
		//List<StateBean> list = stateInterface.getStateBeanListBy();
		return list;
	}
	
	
	public List<DistBean> getDistList(String stCode)
	{
		stCode=(stCode.length()==1?"0"+stCode:stCode);
		List<DistBean> list = distInterface.getDistBeanListByStCode(stCode);
		return list;
	}
}
