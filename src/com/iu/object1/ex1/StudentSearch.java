package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentSearch {
	
	//findStudent
	//

	public Student findStudent (Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 번호 입력");
		int num = sc.nextInt();
		Student student = null;//리턴하려는 학생 데이타
		
		for(int i=0; i<students.length; i++) {
			if(num==students[i].num) {
				student = students[i];
				break;
				} 
			}
				
		return student;
	}

	
}
