package com.tonyfalcon.staffDataService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tonyfalcon.staffDataService.models.Group;
import com.tonyfalcon.staffDataService.models.JsonGroup;
import com.tonyfalcon.staffDataService.repositories.GroupRepository;
import com.tonyfalcon.staffDataService.repositories.StaffRepository;


@RestController
public class GroupController {

    @Autowired
    GroupRepository groupRepository;
    
    @Autowired
    StaffRepository staffRepository;

    @RequestMapping(method=RequestMethod.GET, value="/groups")
    public Iterable<Group> group() {
        return groupRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/groups")
    public String save(@RequestBody JsonGroup JGroup) {
    		GroupHelper grpHelper = new GroupHelper();
    		Group group = grpHelper.jsonToSpringData(JGroup, staffRepository);
        groupRepository.save(group);
        return group.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/groups/{id}")
    public Group show(@PathVariable String id) {
        //return groupRepository.findOne(id);
    		return groupRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/groups/{id}")
    public Group update(@PathVariable String id, @RequestBody JsonGroup JGroup) {
		GroupHelper grpHelper = new GroupHelper();
		Group group = grpHelper.jsonToSpringData(JGroup, staffRepository);
		groupRepository.save(group);
        return group;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/groups/{id}")
    public String delete(@PathVariable String id) {
        //Group group = groupRepository.findOne(id);
        Group group = groupRepository.findById(id).get();
        groupRepository.delete(group);

        return "group deleted";
    }
}
