package service;

import java.util.List;

import com.spi.spi.model.Jedy;

public interface JedyService {
	List<Jedy> getAll();
	Jedy getById(Long id);
	Jedy save(Jedy model);
	Jedy update(Long id, Jedy model);
	void delete(Long id);
}
