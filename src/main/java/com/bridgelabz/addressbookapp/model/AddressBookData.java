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

    

    public AddressBookData( AddressbookDTO addressbookDTO) {
        
        this.fullName = addressbookDTO.fullName;
        this.phoneNumber = addressbookDTO.phoneNumber;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zip = addressbookDTO.zip;
        this.emailid = addressbookDTO.emailid;
    }
    


    
	public AddressBookData() {
		
	}

	
	
}
