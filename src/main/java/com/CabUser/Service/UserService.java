package com.CabUser.Service;

import java.util.List;

import com.CabUser.DTO.UserDTO;
import com.CabUser.Exception.GlobalException;
import com.CabUser.Model.CabUser;
import com.CabUser.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	// Adding the user into database using a method in service
	public  CabUser adduser(UserDTO u1) {
		CabUser u2=CabUser.build(u1.getUserId(),u1.getUserName(),u1.getPhoneNumber(),u1.getEmailId(),u1.getPassword());
		return repo.save(u2);
	}
	 
	// Displaying all the data in output using Lists
	public List<CabUser> getUser()
	{
		return repo.findAll();
		}
	
	// Deleting the data in database using particular id
	public CabUser deleteUser(int id) throws GlobalException
	{
		CabUser _u2=repo.findByUserId(id);
		if(_u2!=null)
		{
			repo.deleteById(id);
			return _u2;
		}
		else
		{
			throw new GlobalException("User not found");
		}
	}
	
	// Updating therow in  Cabuser table 
	public CabUser updateUser(UserDTO u1)
	{
		CabUser _u2=CabUser.build(u1.getUserId(),u1.getUserName(),u1.getPhoneNumber(),u1.getEmailId(),u1.getPassword());
		return repo.save(_u2);
	}
	
	// Displaying the details of user with Id
	public CabUser getUser(int userid) throws GlobalException
	{
		CabUser _u1=repo.findByUserId(userid);
		if(_u1!=null) {
			return _u1;
		}
		else {
			throw new GlobalException("user not found with userid "+userid);
		}
	}

}
