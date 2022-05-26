package com.bridgelabz.addressbookapp.dto;

public class AddressbookDTO {
	public String state;
	public String fullName;

	public AddressbookDTO(String fullName, String state) {
		this.fullName=fullName;
		this.state=state;
	}

	}