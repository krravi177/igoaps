package igoaps.location;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DistInterface extends CrudRepository<DistBean, String>{
  List<DistBean> getDistBeanListByStCode(String stCode);
}
