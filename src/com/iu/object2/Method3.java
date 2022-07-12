package com.iu.object2;

import java.util.Scanner;

public class Method3 {
	public void sal(int salary) {
		System.out.println("월급 계산");
		double tax = salary*0.033;
		salary = salary-(int)(tax);
		salary=20;
		System.out.println(salary);
		
	}
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	//info: 이름, 나이, 이메일 주소 받아서 출력
	public void info(String name, int age, String mail) {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("메일: "+mail);
	}
	
	public void info2(Member m1) {
		System.out.println("이름: "+m1.name);
		System.out.println("나이: "+m1.age);
		System.out.println("메일: "+m1.email);
		System.out.println("전화번호: "+m1.phone);
			m1.age=100;
	}
}
