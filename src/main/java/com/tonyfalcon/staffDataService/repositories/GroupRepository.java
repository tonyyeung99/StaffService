package com.tonyfalcon.staffDataService.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tonyfalcon.staffDataService.models.Group;
import com.tonyfalcon.staffDataService.models.Staff;

public interface GroupRepository extends MongoRepository<Group, String>{

    @Override
    Group findOne(String id);

    @Override
    void delete(Group deleted);
}
