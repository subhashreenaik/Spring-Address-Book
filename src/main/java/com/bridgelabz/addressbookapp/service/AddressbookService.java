package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressbookService {

	private List <AddressBookData> booklist = new ArrayList<>();

	public List<AddressBookData> getAddressbookData() {
		return booklist;
	}

	public AddressBookData getAddressbookDataById(int id) {
		return booklist.get(id );
	}
	

	public AddressBookData createAddressbook(AddressbookDTO dto) {
		AddressBookData book = new AddressBookData(booklist.size()+1,dto);
		booklist.add(book);
	    return book;
		
	}

	public AddressBookData updateById(int bookId, AddressbookDTO dto) {
		AddressBookData newbook = this.getAddressbookDataById(bookId);
		newbook.setFullName(dto.fullName);
		newbook.setState(dto.state);
		booklist.set(bookId - 1, newbook);
		return newbook;
    	
    }

	public AddressBookData deleteAddressbookDataById(int id) {
		return booklist.remove(id);
	}
	}

	

