package com.bridgelabz.addressbookapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

}
