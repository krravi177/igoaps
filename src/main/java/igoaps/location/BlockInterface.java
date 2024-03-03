package igoaps.location;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BlockInterface extends CrudRepository<BlockBean, String>{

	List<BlockBean> getBlockBeanListByDistCode(String blockCode);
}
