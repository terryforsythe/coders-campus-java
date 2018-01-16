package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Person {

	public abstract void setName(String name);

	public abstract String getName();

	public abstract void setSex(String sex);

	public abstract String getSex();

	public abstract void setBirthdate(Calendar birthdate);

	public abstract Calendar getBirthdate();

	@Override
	public String toString() {
		return "Name: " + getName() + ", Sex: " + getSex() + ", Birthdate: " + formatBirthdate();
	}

	private String formatBirthdate() {
		SimpleDateFormat birthdateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		return birthdateFormat.format(getBirthdate().getTime());
	}

}
