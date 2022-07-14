package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	Scanner sc;//스캐너를 멤버변수로 선언
	public StudentService () {
	sc = new Scanner(System.in);//변수 초기화
	}
	
	//removeStudent
	//학생들의 정보를 받아서 삭제하려는 학생의 번호를 입력받고 삭제
	//일치하는 번호의 학생을 삭제
	//남은 학생 정보 리턴
	
	public Student[] delete(Student [] students) {
		boolean check=false;
		int index=0;
		System.out.println("학생 번호 입력");
		int num = sc.nextInt();
		Student [] students2 = new Student [students.length-1];
		for(int i=0; i<students.length; i++) {
			if(num==students[i].getNum()) {
				check=!check;
				break;} 
				if(check) {
//					students2 = new Student [students.length-1];
					for(int j=0; j<students.length; j++) {
						if(i==j) {
							break;}
						students2[index]=students[j];
						index++;
					}
					
					students=students2;
					break;
					
				}else {
				System.out.println("해당 학생이 없습니다");
				break;
		}
	}
		return students;

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
				student.setName(sc.next());
				System.out.println("학생 번호 입력");
				student.setNum(sc.nextInt());				
				System.out.println("국어 점수 입력");
				student.setKor(sc.nextInt());;	
				System.out.println("영어 점수 입력");
				student.setEng(sc.nextInt());;	
				System.out.println("수학 점수 입력");
				student.setMath(sc.nextInt());;
				student.setTotal();
				addSt[students.length]=student;
				students = addSt;
				System.out.println(students[0].getName());
				System.out.println(students[1].getName());
				System.out.println(students[2].getName());
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
					student.setName(sc.next());
					System.out.println("학생 번호 입력");
					student.setNum(sc.nextInt());				
					System.out.println("국어 점수 입력");
					student.setKor(sc.nextInt());	
					System.out.println("영어 점수 입력");
					student.setEng(sc.nextInt());;	
					System.out.println("수학 점수 입력");
					student.setMath(sc.nextInt());;
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
				if(num==students[i].getNum()) {
					student = students[i];
					break;
					} 
				}
					
			return student;
		}
	}
