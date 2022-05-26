package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;


@RestController
@RequestMapping("/addressbook")
public class AddressbookController {
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		
		AddressBookData bookData= new AddressBookData(1,new AddressbookDTO("Pankaj","Odisha"));
		ResponseDTO respDTO = new ResponseDTO("Get call successfull",bookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("get/{addId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("addId") int addId){
		AddressBookData empData= new  AddressBookData(1,new AddressbookDTO("Pankaj","Maharastra"));
		ResponseDTO respDTO = new ResponseDTO("Get call for id successfull",empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
}
