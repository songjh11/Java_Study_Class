package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
//Start 메서드 선언
//	System.out.println("1. 학생 정보 입력");
//	System.out.println("2. 학생 정보 조회");
//	System.out.println("3. 학생 정보 검색");
//	System.out.println("4. 학생 정보 삭제");
//	System.out.println("5. 학생 정보 추가");
//	System.out.println("6. 프로그램 종료");
	//controller에서 모든걸 연결해야함
	
	public void Start() {
		Scanner sc = new Scanner(System.in);
		//객체 생성
		boolean check = true;
		Student [] students = null; 
		StudentService ss = new StudentService();
		StudentService count = new StudentService();
		StudentView sv = new StudentView();
		StudentSearch sch = new StudentSearch();
		StudentDelete sd = new StudentDelete();
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
			students = ss.makeStudents();			
		}else if(select==2) {
			System.out.println("2. 학생 정보 조회");
			sv.view(students);
			}else if(select==3) {
			System.out.println("3. 학생 정보 검색");
			Student student = sch.findStudent(students);
			
			if(student!=null) {
				sv.view(student);
			} else {
				sv.view("찾는 학생이 없어요");
			}
			
		}else if(select==4) {
			System.out.println("4. 학생 정보 삭제");
			sd.delete(students);
		}else if(select==5) {
			System.out.println("5. 학생 정보 추가");
		
		}else {
			System.out.println("6. 프로그램 종료");
			System.out.println("프로그램 종료");
			check=!check;
		}
		
		}
	}
}