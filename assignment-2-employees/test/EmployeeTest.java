package test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import main.Employee;
import main.Google;
import main.Microsoft;
import main.Organization;

public class EmployeeTest {

	String name;
	String sex;
	Calendar birthdate = Calendar.getInstance();
	Organization organization;
	String jobTitle;

	String employee1;
	String employee2;

	@Before
	public void createEmployee1() {
		name = "Bill Gates";
		sex = "male";
		birthdate.set(1955, 9, 28); // month starts on zero-based index
		organization = new Microsoft();
		jobTitle = "Co-Founder";

		employee1 = new Employee(name, sex, birthdate, organization, jobTitle).toString();
	}

	@Test
	public void shouldRecognizeTwoExactEmployeesEntriesAsSamePerson() {

		// Initialize new Employee object and use employee1's parameters
		employee2 = new Employee(name, sex, birthdate, organization, jobTitle).toString();

		assertThat(employee2, is(equalTo(employee1)));
	}

	@Test
	public void shouldRecognizeTwoDifferentEmployeeEntriesAsDifferentPeople() {

		// set birthdate for employee2
		birthdate.set(1973, 7, 21);

		employee2 = new Employee("Sergey Brin", "male", birthdate, new Google(), "Co-Founder").toString();

		assertThat(employee2, is(not(equalTo(employee1))));

	}
}
