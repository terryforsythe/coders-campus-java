package main;

public class Microsoft implements Organization {

	String nameOfOrganization;
	Integer numberOfEmployees;
	
	public Microsoft() {
		this.nameOfOrganization = "Microsoft";
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
