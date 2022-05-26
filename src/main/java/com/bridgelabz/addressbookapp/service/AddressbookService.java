package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressbookService {

	private List <AddressBookData> booklist = new ArrayList<>();

	public List<AddressBookData> getAddressbookData() {
		return booklist;
	}

	public AddressBookData getAddressbookDataById(int Contact_Id) {
		 return booklist.stream().filter(bookdata -> bookdata.getId() == Contact_Id)
				   .findFirst()
				   .orElseThrow(() ->new AddressBookException("Addressbook not found"));
	}

	public AddressBookData createAddressbook(AddressbookDTO dto) {
		AddressBookData book = new AddressBookData(booklist.size()+1,dto);
		booklist.add(book);
	    return book;
		
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
		return newbook;
    	
    }

	public AddressBookData deleteAddressbookDataById(int Contact_Id) {
		return booklist.remove(Contact_Id -1);
	}
	}

	

