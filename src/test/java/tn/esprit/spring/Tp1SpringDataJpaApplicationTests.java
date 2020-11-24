package tn.esprit.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserService;

@RunWith (SpringRunner.class)
@SpringBootTest
public class Tp1SpringDataJpaApplicationTests {
	@Autowired
	UserService us;

	@Test
	 public void contextLoads() {
	}
	/*@Test
	public void testRetrieveAllUsers(){
		us.retrieveAllUsers();
		
	}*/
	@Test 
	public void testAddUser() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = dateFormat.parse("1957-05-09"); 
        User u = new User("bechir", "bader", d, Role.INGENIEUR); 
		us.addUser(u);
		
	}
	/*	@Test
	public void testUpdateUser() throws ParseException {
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("1995-05-09"); 
		User u = new User(1","meriem", "bader", d, Role.INGENIEUR);
		us.updateUser(u);
	}*/
	@Test
	public void testRetrieveUser(){
		us.retrieveUser("1");
	}

@Test
	public void testDeleteUser() throws ParseException {
			
	  us.deleteUser("4");	
	}

}
