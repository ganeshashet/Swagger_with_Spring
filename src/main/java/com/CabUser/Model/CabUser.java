package com.CabUser.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// crating the table in database 
@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
@Entity
public class CabUser {
	
	@Id
	private int userId;
	private String userName;
	private String phoneNumber;
	private String emailId;
	private String Password;

}
