package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repo.AddressBookRepository;

@Service
public class AddressbookService {
	@Autowired
	AddressBookRepository repo;

	private List <AddressBookData> booklist = new ArrayList<>();

	public List<AddressBookData> getAddressbookData() {
		return repo.findAll();
	}

	public AddressBookData getAddressbookDataById(int Contact_Id) {
		 return repo.findById(Contact_Id)
				   .orElseThrow(() ->new AddressBookException("Employee not found"));
	   }

	public AddressBookData createAddressbook(AddressbookDTO dto) {
		AddressBookData book = new AddressBookData(booklist.size()+1,dto);
		booklist.add(book);
		return repo.save(book);
		
	}

	public AddressBookData updateById(int Contact_Id, AddressbookDTO dto) {
		AddressBookData newbook = this.getAddressbookDataById(Contact_Id);
		newbook.setFullName(dto.fullName);
		newbook.setState(dto.state);
		newbook.setAddress(dto.address);
		newbook.setCity(dto.city);
		newbook.setEmailid(dto.emailid);
		newbook.setPhoneNumber(dto.phoneNumber);
		newbook.setZip(dto.zip);
		booklist.set(Contact_Id - 1, newbook);
		return repo.save(newbook);
    }

	public void deleteAddressbookDataById(int Contact_Id) {
		AddressBookData empData = this.getAddressbookDataById(Contact_Id);
        repo.delete(empData);
    }
	}

	

