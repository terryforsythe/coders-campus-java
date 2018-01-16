package main;

import java.util.Calendar;

public class Employee extends Person {

	private String name;
	private String sex;
	private Calendar birthdate;
	private Organization organization;
	private String jobTitle;

	public Employee(String name, String sex, Calendar birthdate, Organization organization, String jobTitle) {
		this.name = name;
		this.sex = sex;
		this.birthdate = birthdate;
		this.organization = organization;
		this.jobTitle = jobTitle;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String getSex() {
		return sex;
	}

	@Override
	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public Calendar getBirthdate() {
		return birthdate;
	}

	@Override
	public String toString() {
		return super.toString() + ", Organization: " + getOrganization() + ", Job Title: " + getJobTitle();
	}

}
