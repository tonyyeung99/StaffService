package com.tonyfalcon.staffDataService.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tonyfalcon.staffDataService.models.Group;
import com.tonyfalcon.staffDataService.models.JsonGroup;
import com.tonyfalcon.staffDataService.models.JsonStaffID;
import com.tonyfalcon.staffDataService.models.Staff;
import com.tonyfalcon.staffDataService.repositories.GroupRepository;
import com.tonyfalcon.staffDataService.repositories.StaffRepository;

public class GroupHelper {
//    @Autowired
//    StaffRepository staffRepository;
        
	public Group jsonToSpringData(JsonGroup jsonGroup, StaffRepository staffRepository) {
		List<Staff> staffs = new ArrayList<Staff>();
		for(JsonStaffID id : jsonGroup.getGrpStaffIds() ) {
			//staffs.add(staffRepository.findOne(id.getStaffId()));
			staffs.add(staffRepository.findById(id.getStaffId()).get());
		}
		Group group = shallowCloneGroupData(jsonGroup);
		group.setGrpStaffs(staffs);
		return  group;
	}
	
	private Group shallowCloneGroupData(JsonGroup jsonGroup) {
		Group group = new Group();
		group.setId(jsonGroup.getId());
		group.setGrpName(jsonGroup.getGrpName());
		group.setGrpDesc(jsonGroup.getGrpDesc());
		return group;
	}
}
