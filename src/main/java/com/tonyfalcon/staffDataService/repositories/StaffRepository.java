package com.tonyfalcon.staffDataService.repositories;

import com.tonyfalcon.staffDataService.models.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StaffRepository extends MongoRepository<Staff, String> {
    @Override
    Staff findOne(String id);

    @Override
    void delete(Staff deleted);
}