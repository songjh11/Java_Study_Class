package com.iu.object1.ex1;

import java.util.Scanner;

public class TTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		Student [] students = new Student[7];
						
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
				student=students[i];		
		}
	}

}
