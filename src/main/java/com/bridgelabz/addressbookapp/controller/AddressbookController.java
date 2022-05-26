package com.bridgelabz.addressbookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.AddressbookService;


@RestController
@RequestMapping("/addressbook")
public class AddressbookController {
	
	@Autowired
	AddressbookService service;
	
	
	@RequestMapping(value= {"","/","get"})
	public ResponseEntity<ResponseDTO> getAddressbookData(){
	    List<AddressBookData> bookList =service.getAddressbookData();
	    ResponseDTO responseDTO = new ResponseDTO("Get Call Success",bookList);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{bookId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollDataById(@PathVariable("bookId") int bookId){
		AddressBookData addressData=service.getAddressbookDataById(bookId);
	    ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id:", addressData);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	@PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressbook(@RequestBody AddressbookDTO addressDTO){
		AddressBookData newbook = service.createAddressbook(addressDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", newbook);
        return new ResponseEntity<>(responseDTO,HttpStatus.CREATED);
    }
	
	
	@PutMapping("/update/{bookId}")
    public ResponseEntity<ResponseDTO> updateById(@PathVariable int bookId,@RequestBody AddressbookDTO addressDTO){
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", service.updateById(bookId,addressDTO));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollDataById(@PathVariable("bookId") int bookId){
		AddressBookData addressData=service.deleteAddressbookDataById(bookId);
	    ResponseDTO responseDTO = new ResponseDTO("selected id is deleted:", addressData);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	
	
}
