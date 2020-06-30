package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spi.spi.model.Jedy;

import exception.NotFoundException;
import repository.JedyRepository;

@Service
@Transactional
public class JedyServiceImpl implements JedyService{
	
	@Autowired
	private JedyRepository jedyRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Jedy> getAll() {
		return jedyRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Jedy getById(Long id) {
		// TODO Auto-generated method stub
		return jedyRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Jedy","id",id));
	}

	@Override
	public Jedy save(Jedy model) {
		return jedyRepository.save(model);
	}

	@Override
	public Jedy update(Long id, Jedy model) {
		jedyRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Jedy","id",id));
        model.setId(id);
        return jedyRepository.save(model);
	}

	@Override
	public void delete(Long id) {
		Jedy jedy = jedyRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Jedy","id",id));
		jedyRepository.delete(jedy);
	}

}
