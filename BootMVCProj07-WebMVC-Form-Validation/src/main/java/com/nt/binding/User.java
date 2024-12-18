package com.nt.binding;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {

	@NotEmpty(message="uname is required")
	@Size(min=3,max=8 ,message="Uname should be between  3 to 8 characters ")
	private String uname;
	
	@NotEmpty(message="password is required")
	private String pwd;
	
	@NotEmpty(message="Email is required")
	@Email(message="Enter valid Email ID")
		private String email;
	
	@NotEmpty(message="phone Number is required")
	@Size(min=10,message="phone numbers should have atleast 10 digits")
	private String phno; 
	
	@NotNull(message = "Age is mandatory")
	@Min(value=18,message="Age should be atleast 18 ")
	@Max(value=60,message="Age should be maximum 60 ")

	private Integer age;
}
