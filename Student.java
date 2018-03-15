package com.konovalov;

public class Student extends Human {
String faculty;
int rank;
public Student(String surname, String name, int year, boolean sex, String faculty, int rank) {
	super(surname, name, year, sex);
	this.faculty = faculty;
	this.rank = rank;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String surname, String name, int year, boolean sex) {
	super(surname, name, year, sex);
	// TODO Auto-generated constructor stub
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}
@Override
public String toString() {
	return (faculty!=null)?"Student"+ super.toString()+"faculty=" + faculty + ", rank=" + rank+"] ":"";
}



}
