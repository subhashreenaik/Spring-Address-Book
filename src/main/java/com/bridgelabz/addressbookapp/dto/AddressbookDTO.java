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
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name invalid")
	public String fullName;
	
	@NotNull(message = "State can not be null...")
	public String state;
	

//	public AddressbookDTO(String fullName, String state) {
//		this.fullName=fullName;
//		this.state=state;
//	}

	}