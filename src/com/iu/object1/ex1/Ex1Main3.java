package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//레퍼런스, 지역변수, 주소값, 참조변수
		Student [] students = new Student [3];
		
		for(int i=0; i<students.length; i++) {
			Student st = new Student();	
			students[i]=st;
			System.out.println("이름 입력");
			students[i].name=sc.next();//둘 다 됨
			st.name = sc.next();//둘 다 됨
					} System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
	}

}
