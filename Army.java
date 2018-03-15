package com.konovalov;

public interface Army {
	default Student[] goToArmy(Group group) {
		Student[] temp= group.getArrStudentArmy();
		
		int n = 0;
		int m=0;
		for (int i = 0; i < temp.length; i++) {
			if (Group.checkYear() - temp[i].getYearOfBirth() >= 18 && temp[i].isSex()==true) {
				m++;
			}
		}
		Student[] goToArmy = new Student[m];
		for (int i = 0; i < temp.length; i++) {
			if (Group.checkYear() - temp[i].getYearOfBirth() >= 18 && temp[i].isSex()==true) {
				goToArmy[n] = temp[i];
				n += 1;
			}
		}

		return goToArmy;
	}



}
