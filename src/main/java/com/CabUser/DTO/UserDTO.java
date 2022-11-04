package com.CabUser.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// data validation with object(data to objects)
public class UserDTO {
   
	@Min(0)
	@Max(1000)
	@NotNull(message="user Id is can not be null")
	//@Pattern(regexp="[0-9]{1,}")
	private int userId;
	@NotNull(message="username can not be null")
	private String userName;
	@Pattern(regexp="[0-9]{10}")
	private String phoneNumber;
	@Email
	private String emailId;
	@Pattern(regexp="[a-zA-Z0-9@]{6,15}")
	private String password;

}
