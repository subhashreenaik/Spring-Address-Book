package com.bridgelabz.addressbookapp.dto;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressbookDTO {
	
	@NotEmpty(message="Name canot be null")
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="person name is invalid")
	public String fullName;
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$", message = "State is Invalid ")
    @NotEmpty(message = "State cannot be null")
    public String state;
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$", message = "City is Invalid! ")
    @NotEmpty(message = "City cannot be null")
    public String city;
    
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$", message = "Address is Invalid! ")
    @NotEmpty(message = "Address cannot be null")
    public String address;
	
	@Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$",message = "Zip is invalid")
    @NotEmpty(message = "zip cannot be null")
    public String zip;
	
	 @Pattern(regexp = "^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$",message = "Phone number is Invalid")
	    public String phoneNumber;
	 
	 @Pattern(regexp = "^[a-zA-Z-9]+([._+-][0-9A-Za-z]+)@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$",message = "email not valid")
	    @NotEmpty(message = "Employee Name can't be null")
	    public String emailid;


	}