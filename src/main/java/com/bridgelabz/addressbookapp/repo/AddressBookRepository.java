package com.bridgelabz.addressbookapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
	

	@Query(value = "select * from addressbook_table c order by c.city ASC  ", nativeQuery = true)
	List<AddressBookData> sortAddressbookDataByCity();
	
	
	@Query(value = "select * from addressbook_table c order by c.state ASC  ", nativeQuery = true)
	List<AddressBookData> sortAddressbookDataByState();

}
