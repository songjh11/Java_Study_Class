package com.iu.object1.ex1;



public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//StudentController의 Start메서드 호출
		//출력하는게 main의 일임

		StudentController s1 = new StudentController();
		
		s1.Start();
		

	}

}
