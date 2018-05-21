package com.tonyfalcon.staffDataService.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "groups")
public class Group {

    @Id
    String id;
    
    private String grpName;
    private String grpDesc;
    @DBRef
    List<Staff> grpStaffs;
    
    
    public Group() {}
	public Group(String grpName, String grpDesc, List<Staff> grpStaffs) {
		super();
		this.grpName = grpName;
		this.grpDesc = grpDesc;
		this.grpStaffs = grpStaffs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrpName() {
		return grpName;
	}
	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}
	public String getGrpDesc() {
		return grpDesc;
	}
	public void setGrpDesc(String grpDesc) {
		this.grpDesc = grpDesc;
	}
	public List<Staff> getGrpStaffs() {
		return grpStaffs;
	}
	public void setGrpStaffs(List<Staff> grpStaffs) {
		this.grpStaffs = grpStaffs;
	}
    
    
}
