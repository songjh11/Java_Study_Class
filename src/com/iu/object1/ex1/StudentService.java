package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	Scanner sc;//스캐너를 멤버변수로 선언
	public StudentService () {
		sc = new Scanner(System.in);//변수 초기화
	}
	
	//addStudent
	//학생 한명 추가
	
	public Student[] addStudent (Student [] students) {
		
		Student [] addSt = new Student [students.length+1];
		for(int i=0; i<students.length; i++) {
			addSt[i]=students[i];
			}
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
		student.setTotal();
		addSt[addSt.length]=student;
		students = addSt;
		
		return students;
	}
	
	
	//makeStudents
	//학생 수를 입력받고
	//학생수만큼 정보를 입력받음
	//이름, 번호, 국영수 점수,       총점, 평균은 자동계산
	//학생 정보 리턴
	
		public Student[] makeStudents() {
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
//					student.total = student.kor+student.eng+student.math;
//					student.avg = student.total/3;
					students[i]=student;
					student.setTotal();
			}
			
			return students;
		}
		
		public Student findStudent (Student [] students) {
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
