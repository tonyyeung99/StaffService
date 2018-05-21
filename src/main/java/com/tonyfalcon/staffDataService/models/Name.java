package com.tonyfalcon.staffDataService.models;

public class Name {
	private String first;
	private String last;
	private String initials;	
	
	public Name() {}
	public Name(String first, String last, String initials) {
		super();
		this.first = first;
		this.last = last;
		this.initials = initials;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}

}
