package com.konovalov;

public class Human {
private	String surname;
private	String name;
private	int yearOfBirth;
private	boolean sex;
	
	public Human(String surname, String name, int yearOfBirth, boolean sex) {
	super();
	this.surname = surname;
	this.name = name;
	this.yearOfBirth = yearOfBirth;
	this.sex = sex;
}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public boolean isSex() {
		return sex;
	}
		
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	//@Override
	public String toString() {
		
		return (surname!=null)?"[surname=" + surname + ", name=" + name + ", yearOfBirth=" + yearOfBirth + ", sex=" + boolSexToSexString()+"," + " ":"";
	}

	
	public String boolSexToSexString(){
		String sexStr;
		if (sex==true) {
			 sexStr="male";
		} else {
 sexStr="female";
		}
		return sexStr;
	}
}