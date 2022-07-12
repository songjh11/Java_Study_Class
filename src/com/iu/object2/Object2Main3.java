package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Method3 m3 = new Method3();
		int salary = 5000000;
		m3.sal(salary);//salary=5000000은 인자값
		System.out.println(salary);//메서드에 사용한 매개변수 salary와 지역변수 salary는 다른 변수임
		
//		m3.hap(10, 20);
		//
		
		System.out.println("이름 입력");
		String name=sc.next();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		System.out.println("메일 입력");
		String mail = sc.next();
		
		m3.info(name, age, mail);
		
		Member m1 = new Member();
		m1.name = "ming";
		m1.age = 20;
		m1.email = "ming@j.com";
		m3.info2(m1);
		System.out.println(m1.age);//<-
		m1.age=200;
		System.out.println(m1.age);
		
	}

}
