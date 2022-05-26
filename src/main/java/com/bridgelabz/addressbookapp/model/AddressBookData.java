package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;

public class AddressBookData {
	public int id;
    
	

	public String fullName;
    public String phoneNumber;
    public String address;
    public String city;
    public String state;
    public int zip;

    public AddressBookData(AddressBookData addressbook) {
        this.id= id;
        this.fullName = addressbook.fullName;
        this.phoneNumber = addressbook.phoneNumber;
        this.address = addressbook.address;
        this.city=addressbook.city;
        this.state = addressbook.state;
        this.zip=addressbook.zip;
    }

    public AddressBookData(int id,AddressbookDTO addressbookDTO) {
        this.id= id;
        this.fullName = addressbookDTO.fullName;
//        this.phoneNumber = addressbookDTO.phoneNumber;
//        this.address = addressbookDTO.address;
//        this.city = addressbookDTO.city;
      this.state = addressbookDTO.state;
//        this.zip = addressbookDTO.zip;
    }

    public AddressBookData(Integer id, AddressbookDTO addressbookDTO) {
        this.id= id;
        this.fullName = addressbookDTO.fullName;
//        this.phoneNumber = addressbookDTO.phoneNumber;
//        this.address = addressbookDTO.address;
//        this.city = addressbookDTO.city;
          this.state = addressbookDTO.state;
//        this.zip = addressbookDTO.zip;
    }
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "AddressBookData [id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
}
