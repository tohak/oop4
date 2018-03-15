package com.konovalov;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human humanOne = new Human("Konovalov", "Anton", 1991, true);

		Student studentOne = new Student("One", "Arst", 1992, true, "It", 3);
		Student studentTho = new Student("Tho", "Adsart", 1993, true, "It", 3);
		Student studentThree = new Student("Three", "Adrt", 1994, true, "It", 3);
		Student studentFour = new Student("Four", "Agfrt", 1995, true, "It", 3);
		Student studentFive = new Student("Five", "Asrt", 1996, true, "It", 3);
		Student studentSix = new Student("Six", "Arrt", 1997, false, "It", 3);
		Student studentSeven = new Student("Seven", "Aeqrt", 1998, true, "It", 3);
		Student studentEight = new Student("Eight", "Aeqwrt", 1999, true, "It", 3);
		Student studentNine = new Student("Nine", "Areqt", 1992, false, "It", 3);
		Student studentTen = new Student("Ten", "Aeqrt", 1993, true, "It", 3);
		Student studentEleven = new Student("Eleven", "Aehrt", 1991, true, "It", 3);

		Group group = new Group();
		try {
			group.add(studentOne);
			group.add(studentTho);
			group.add(studentThree);
			group.add(studentFour);
			group.add(studentFive);
			group.add(studentSix);
			group.add(studentSeven);
			group.add(studentEight);
			group.add(studentNine);
			// group.add(studentTen);
			// group.add(studentEleven);
			//group.addNewStudent();
		} catch (Exception e) {
			System.out.println("Error, more than 10 can not be created");
			;
		}
		
		System.out.println(group);
		group.sort();
		System.out.println(group);
		
		Student [] arrayStudentArmy= group.goToArmy(group);
		for (Student student : arrayStudentArmy) {
			System.out.println(student);
		}
		
		

	}

}
