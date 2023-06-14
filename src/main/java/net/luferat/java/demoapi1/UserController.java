package net.luferat.java.demoapi1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trecos")
public class UserController {

	@SuppressWarnings("unused")
	@Autowired
	private  UserController  UserController;

	@GetMapping
	public List<User> getAll() {
		return  net.luferat.java.demoapi1.UserController.findAll();
	}

	private static List<User> findAll() {
		return null;
	}

	@GetMapping(path = "/{id}")
	public Treco getOne(@PathVariable Long id) {
		if ( net.luferat.java.demoapi1.UserController.existsById(id)) {
			return  ((Object) net.luferat.java.demoapi1.UserController.findById(id)).get();
		}
		return null;
	}

	private static Object findById(Long id) {
		return null;
	}

	private static boolean existsById(Long id) {
		return false;
	}

	@PostMapping
	public User post(@RequestBody User user) {
		return  net.luferat.java.demoapi1.UserController.save(user);
	}

	private static User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@DeleteMapping(path = "/{id}", produces = "application/json")
	public static String delete(@PathVariable Long id) {
		if (net.luferat.java.demoapi1.UserController.existsById(id)) {
			 net.luferat.java.demoapi1.UserController.delete(id);
			return "{ \"status\" : \"deleted\" }";
		}
		return "{ \"status\" : \"error\" }";
	}
	
	@PutMapping(path = "/{id}")
	public User put(@PathVariable Long id, @RequestBody User user) {
		return null;
	}
	
	@PatchMapping(path = "/{id}")
	public User patch(@PathVariable Long id, @RequestBody User user) {
		return null;
	}

}