package com.tonyfalcon.staffDataService.repositories;

import com.tonyfalcon.staffDataService.models.Staff;

import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StaffRepository extends MongoRepository<Staff, String> {

    //Staff findOne(String id);
	//@Override
	Optional<Staff> findById(String id);



	@Override
    void delete(Staff deleted);
}