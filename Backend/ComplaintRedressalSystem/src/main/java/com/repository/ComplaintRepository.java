package com.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Complaints;


public interface ComplaintRepository extends CrudRepository<Complaints, Integer> {

//	Iterable<Complaints> findAll(Sort sort);
	List<Complaints> findComplaintByCustomerEmail(String customerEmail);

	List<Complaints> findComplaintByPincode(String managerPincode); 

}

