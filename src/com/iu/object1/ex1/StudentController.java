package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
//Start 메서드 선언
	Scanner sc;
	//객체 생성
	StudentService studentService;
	StudentView sv;
	Student [] students; 
//	System.out.println("1. 학생 정보 입력");
//	System.out.println("2. 학생 정보 조회");
//	System.out.println("3. 학생 정보 검색");
//	System.out.println("4. 학생 정보 삭제");
//	System.out.println("5. 학생 정보 추가");
//	System.out.println("6. 프로그램 종료");
	//controller에서 모든걸 연결해야함
	
	public StudentController() {
		sc = new Scanner(System.in);
		sv = new StudentView();
		studentService = new StudentService();
	}
	public void Start() {
		boolean check = true;
		StudentService count = new StudentService();
		StudentService sch = new StudentService();
		Student string = new Student();
		
		
		while(check) {
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 조회");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 학생 정보 추가");
		System.out.println("6. 프로그램 종료");
		int select = sc.nextInt();
		if(select==1) {
			System.out.println("1. 학생 정보 입력");
			students = studentService.makeStudents();			
		}else if(select==2) {
			System.out.println("2. 학생 정보 조회");
			sv.view(students);
			}else if(select==3) {
			System.out.println("3. 학생 정보 검색");
			Student student = studentService.findStudent(students);
			
			if(student!=null) {
				sv.view(student);
			} else {
				sv.view("찾는 학생이 없어요");
			}
			
		}else if(select==4) {
			System.out.println("4. 학생 정보 삭제");
			students=studentService.delete(students);
			
		}else if(select==5) {
			System.out.println("5. 학생 정보 추가");
			students=studentService.addStudent(students);
			
		
		}else {
			System.out.println("6. 프로그램 종료");
			System.out.println("프로그램 종료");
			check=!check;
		}
		
		}
	}
}