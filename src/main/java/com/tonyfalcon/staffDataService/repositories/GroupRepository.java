package com.tonyfalcon.staffDataService.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tonyfalcon.staffDataService.models.Group;
import com.tonyfalcon.staffDataService.models.Staff;

public interface GroupRepository extends MongoRepository<Group, String>{

    //Group findOne(String id);

	Optional<Group> findById(String id);

    @Override
    void delete(Group deleted);
}
