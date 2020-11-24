package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.User;

@RestController
public class UserRestControlImpl {

	@Autowired
	UserService userService;

@GetMapping("/retrieve-all-users")
@ResponseBody
 public List<User> getUsers() {
	 List<User> list = userService.retrieveAllUsers();
 return list;
 }

@GetMapping("/retrieve-user/{user-id}")
@ResponseBody
public User retrieveUser(@PathVariable("user-id") String userId) {
return userService.retrieveUser(userId);
}

// Ajouter User : http://localhost:8081/SpringMVC/servlet/add-user
@PostMapping("/add-user")
@ResponseBody
public User addUser(@RequestBody User u) {
User user = userService.addUser(u);
return user;
}

@DeleteMapping("/remove-user/{user-id}")
@ResponseBody
public void removeUser(@PathVariable("user-id") String userId) {
userService.deleteUser(userId);
}

// http://localhost:8081/SpringMVC/servlet/modify-user
@PutMapping("/modify-user")
@ResponseBody
public User modifyUser(@RequestBody User user) {
return userService.updateUser(user);
}
}
