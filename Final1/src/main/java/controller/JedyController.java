package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spi.spi.model.Jedy;

import service.JedyService;

@RestController
@RequestMapping("/jedys")
public class JedyController {
	
	@Autowired
	private JedyService jedyService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Jedy> getAll() { 
		return jedyService.getAll();
	}
	
	@GetMapping("{id}")
	public Jedy getById(@PathVariable Long id) {
		return jedyService.getById(id);
	}
	
	@PostMapping
	public Jedy save(@RequestBody Jedy model) {
		return jedyService.save(model);
	}
	
	@PutMapping("{id}")
    public Jedy editar(@RequestBody Jedy model, @PathVariable("id") Long id){
        return jedyService.update(id, model);
    }
	
	@DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        jedyService.delete(id);
    }
	
}
