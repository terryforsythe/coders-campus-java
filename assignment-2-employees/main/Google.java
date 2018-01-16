package main;

public class Google implements Organization {

	String nameOfOrganization;
	Integer numberOfEmployees;
	
	public Google() {
		this.nameOfOrganization = "Google";
	}

	@Override
	public void setNameOfOrganization(String nameOfOrganization) {
		this.nameOfOrganization = nameOfOrganization;
	}

	@Override
	public String getNameOfOrganization() {
		return nameOfOrganization;
	}

	@Override
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

}
