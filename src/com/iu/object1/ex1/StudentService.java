package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {

	//makeStudents
	//학생 수를 입력받고
	//학생수만큼 정보를 입력받음
	//이름, 번호, 국영수 점수,       총점, 평균은 자동계산
	//학생 정보 리턴
	
	public Student[] makeStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		Student [] students = new Student[count];
						
		for(int i =0; i<count; i++) {
			Student student = new Student();
				System.out.println("학생 이름 입력");
				student.name = sc.next();
				System.out.println("학생 번호 입력");
				student.num = sc.nextInt();				
				System.out.println("국어 점수 입력");
				student.kor = sc.nextInt();	
				System.out.println("영어 점수 입력");
				student.eng = sc.nextInt();	
				System.out.println("수학 점수 입력");
				student.math = sc.nextInt();
				student.total = student.kor+student.eng+student.math;
				student.avg = student.total/3;
				students[i]=student;		
		}
		
		return students;
	}
}
