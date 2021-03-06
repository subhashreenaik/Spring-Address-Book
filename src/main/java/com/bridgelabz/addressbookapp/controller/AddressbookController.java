package com.bridgelabz.addressbookapp.controller;

import java.util.List;

import javax.validation.Valid;

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
	
	
	@GetMapping(value= {"","/","get"})
	public ResponseEntity<ResponseDTO> getAddressbookData(){
	    List<AddressBookData> bookList =service.getAddressbookData();
	    ResponseDTO responseDTO = new ResponseDTO("Get Call Success",bookList);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{Contact_Id}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollDataById(@PathVariable("Contact_Id") int Contact_Id){
		AddressBookData addressData=service.getAddressbookDataById(Contact_Id);
	    ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id:", addressData);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	@PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressbook(@Valid @RequestBody AddressbookDTO addressDTO){
		AddressBookData newbook = service.createAddressbook(addressDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", newbook);
        return new ResponseEntity<>(responseDTO,HttpStatus.CREATED);
    }
	
	
	@PutMapping("/update/{Contact_Id}")
    public ResponseEntity<ResponseDTO> updateById(@PathVariable int Contact_Id,@Valid @RequestBody AddressbookDTO addressDTO){
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", service.updateById(Contact_Id,addressDTO));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
	@DeleteMapping("/delete/{Contact_Id}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollDataById(@PathVariable("Contact_Id") int Contact_Id){
		service.deleteAddressbookDataById(Contact_Id);
	    ResponseDTO responseDTO = new ResponseDTO("selected id is deleted:", "contact id is"+Contact_Id);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/sortedcity")
    public ResponseEntity<ResponseDTO> sortAddressbookDataByCity() {

        List<AddressBookData> citylist = null;
        citylist = service.sortAddressbookDataByCity();
        ResponseDTO response = new ResponseDTO("Get Call for sortedcity Successful", citylist);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
	@GetMapping("/sortedstate")
    public ResponseEntity<ResponseDTO> sortAddressbookDataByState() {

        List<AddressBookData> statelist = null;
        statelist = service.sortAddressbookDataByState();
        ResponseDTO response = new ResponseDTO("Get Call for sortedstate Successful", statelist);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
	
	
}
