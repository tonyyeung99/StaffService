package com.tonyfalcon.staffDataService.controllers;

import com.tonyfalcon.staffDataService.models.Staff;
import com.tonyfalcon.staffDataService.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.GET, value="/staffs")
    public Iterable<Staff> staff() {
        return staffRepository.findAll();
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.POST, value="/staffs")
    public Staff save(@RequestBody Staff staff) {
        staffRepository.save(staff);

        //return staff.getId();
        return staff;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.GET, value="/staffs/{id}")
    public Staff show(@PathVariable String id) {
        //return staffRepository.findOne(id);
    		return staffRepository.findById(id).get();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.PUT, value="/staffs/{id}")
    public Staff update(@PathVariable String id, @RequestBody Staff staff) {
        //Staff stf = staffRepository.findOne(id);
    	    Staff stf = staffRepository.findById(id).get();
        if(staff.getStaffName() != null)
        		stf.setStaffName(staff.getStaffName());
        if(staff.getPhoneNumbers() != null)
    			stf.setPhoneNumbers(staff.getPhoneNumbers());
        staffRepository.save(stf);
        return stf;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.DELETE, value="/staffs/{id}")
    public Staff delete(@PathVariable String id) {
        //Staff staff = staffRepository.findOne(id);
    		Staff staff = staffRepository.findById(id).get();
        staffRepository.delete(staff);
        staff = new Staff();
        return staff;
    }
}