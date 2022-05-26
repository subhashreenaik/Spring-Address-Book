package com.bridgelabz.addressbookapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import lombok.Data;

@Entity
@Table(name="addressbook_table")

public @Data class AddressBookData {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Contact_Id")
	public int Contact_Id;
    
	@Column(name = "fullName")
	public String fullName;
	
	@Column(name = "phoneNumber")
    public String phoneNumber;
	
	@Column(name = "address")
    public String address;
	
	@Column(name = "emailid")
    public String emailid;
	
	@Column(name = "city")
    public String city;
	
	@Column(name = "state")
    public String state;
	
	@Column(name = "zip")
    public String zip;

    public AddressBookData(int Contact_Id,AddressBookData addressbook) {
        this.Contact_Id= Contact_Id;
        this.fullName = addressbook.fullName;
        this.phoneNumber = addressbook.phoneNumber;
        this.address = addressbook.address;
        this.city=addressbook.city;
        this.state = addressbook.state;
        this.zip=addressbook.zip;
        this.emailid=addressbook.emailid;
    }

    public AddressBookData(int Contact_Id,AddressbookDTO addressbookDTO) {
        this.Contact_Id= Contact_Id;
        this.fullName = addressbookDTO.fullName;
        this.phoneNumber = addressbookDTO.phoneNumber;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zip = addressbookDTO.zip;
        this.emailid = addressbookDTO.emailid;
    }

    public AddressBookData(Integer Contact_Id, AddressbookDTO addressbookDTO) {
        this.Contact_Id= Contact_Id;
        this.fullName = addressbookDTO.fullName;
        this.phoneNumber = addressbookDTO.phoneNumber;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zip = addressbookDTO.zip;
        this.emailid = addressbookDTO.emailid;
    }
    
    public int getId() {
        return Contact_Id;
    }

    public void setId(int id) {
        this.Contact_Id = Contact_Id;
    }
	

	
	@Override
	public String toString() {
		return "AddressBookData [Contact_Id=" + Contact_Id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
}
