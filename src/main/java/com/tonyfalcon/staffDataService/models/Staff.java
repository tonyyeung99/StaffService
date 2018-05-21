package com.tonyfalcon.staffDataService.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staffs")
public class Staff {
    @Id
    String id;
    
    private Name staffName;
	private String title;
    private String div;
    private String dept;
    private String office;
    private String email;
    List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();


    public Staff() {
    }

    public Staff(Name staffName, List<PhoneNumber> phoneNumbers) {
        this.staffName = staffName;
        this.phoneNumbers = phoneNumbers;
    }

    public Name getStaffName() {
		return staffName;
	}

	public void setStaffName(Name staffName) {
		this.staffName = staffName;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
}