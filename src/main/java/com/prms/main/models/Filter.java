package com.prms.main.models;

import java.util.Date;

public class Filter {
	private boolean filterValue;
	private boolean status;
	private boolean gender;
	private boolean birthdate;
	private boolean male;
	private boolean female;
	private boolean others;
	private String statusValue;
	private Date startDate;
	private Date endDate;
	
	public boolean isFilterValue() {
		return filterValue;
	}
	public boolean isStatus() {
		return status;
	}
	public boolean isGender() {
		return gender;
	}
	public boolean isBirthdate() {
		return birthdate;
	}
	public boolean isMale() {
		return male;
	}
	public boolean isFemale() {
		return female;
	}
	public boolean isOthers() {
		return others;
	}
	public String getStatusValue() {
		return statusValue;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	
	
	public Filter(boolean filterValue, boolean status, boolean gender, boolean birthdate, boolean male, boolean female,
			boolean others, String statusValue, Date startDate, Date endDate) {
		super();
		this.filterValue = filterValue;
		this.status = status;
		this.gender = gender;
		this.birthdate = birthdate;
		this.male = male;
		this.female = female;
		this.others = others;
		this.statusValue = statusValue;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
