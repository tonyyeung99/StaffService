package com.tonyfalcon.staffDataService.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

public class JsonGroup {

    @Id
    String id;
    
    private String grpName;
    private String grpDesc;

    List<JsonStaffID> grpStaffIds=new ArrayList<JsonStaffID>();
    
    
    public JsonGroup() {}
	public JsonGroup(String grpName, String grpDesc, List<JsonStaffID> grpStaffId) {
		super();
		this.grpName = grpName;
		this.grpDesc = grpDesc;
		this.grpStaffIds = grpStaffId;
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
	public List<JsonStaffID> getGrpStaffIds() {
		return grpStaffIds;
	}
	public void setGrpStaffIds(List<JsonStaffID> grpStaffId) {
		this.grpStaffIds = grpStaffId;
	}
    
    
}
