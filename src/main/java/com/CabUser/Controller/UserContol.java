package com.CabUser.Controller;

import java.util.List;

import javax.validation.Valid;

import com.CabUser.DTO.UserDTO;
import com.CabUser.Exception.GlobalException;
import com.CabUser.Model.CabUser;
import com.CabUser.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// creating REST APIs to do CRUD Operation to control
@RestController
// Mapping with main Thing 
@RequestMapping("/CabUser")
public class UserContol {
	@Autowired
	private UserService service;
	
	// Adding values in database using Post mapping
	@PostMapping("/add")
	public ResponseEntity<CabUser> addCabUser(@RequestBody @Valid UserDTO d1 ){
		 return new ResponseEntity<>(service.adduser(d1),HttpStatus.OK);
		
	}
	
	// Display or Retrieve the data from database
	@GetMapping("/display")
	public ResponseEntity<List<CabUser>> getCabUser()
	{
		return new ResponseEntity<>(service.getUser(),HttpStatus.ACCEPTED);
	}
	
	// Deleting a data in the database using id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<CabUser> deleteCabUser(@PathVariable int id) throws GlobalException
	{
		return new ResponseEntity<>(service.deleteUser(id),HttpStatus.ACCEPTED);
		
	}
	
	// Updating the data in the database
	@PutMapping("/update")
	public ResponseEntity<CabUser> updateUser(@RequestBody @Valid UserDTO u1)
	{
		return new ResponseEntity<>(service.updateUser(u1),HttpStatus.OK);
	}
	
	//display or retrieving the data with particular id
	@GetMapping("/{id}")
	public ResponseEntity<CabUser> getUser(@PathVariable int id) throws GlobalException{
		return new ResponseEntity<>(service.getUser(id),HttpStatus.OK);
	}
	

}
