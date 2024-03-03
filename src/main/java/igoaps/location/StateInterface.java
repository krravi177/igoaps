package igoaps.location;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StateInterface extends CrudRepository<StateBean, Integer>{
	List<StateBean> getStateBeanListBy();
}
