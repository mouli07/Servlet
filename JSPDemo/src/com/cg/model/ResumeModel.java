package com.cg.model;

public class ResumeModel {
	
	private String fname;
	private String lname;
	private String dob;
	private String gender;
	private String address;
	private String contact;
	private String email;
	private String hobbies[];
	private String HQualification;
	private String skills[];
	private String website;
	private String summary;
	

	public ResumeModel(String fname, String lname, String dob, String gender, String address, String contact,
			String email, String[] hobbies, String hQualification, String[] skills, String website, String summary) {
		
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.hobbies = hobbies;
		HQualification = hQualification;
		this.skills = skills;
		this.website = website;
		this.summary = summary;
	}


	


	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public String getDob() {
		return dob;
	}


	public String getGender() {
		return gender;
	}


	public String getAddress() {
		return address;
	}


	public String getContact() {
		return contact;
	}


	public String getEmail() {
		return email;
	}


	public String[] getHobbies() {
		return hobbies;
	}


	public String getHQualification() {
		return HQualification;
	}


	public String[] getSkills() {
		return skills;
	}


	public String getWebsite() {
		return website;
	}


	public String getSummary() {
		return summary;
	}
	
	
	
	
	
	
	

}
