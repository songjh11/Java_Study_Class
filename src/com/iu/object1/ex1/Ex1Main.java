package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		Student stu1 = new Student ();//object1
//		stu1.name="mingming";
//		stu1.num = 1;
//		stu1.kor=97;
//		stu1.eng=95;
//		stu1.math=100;
//		stu1.total= stu1.kor+stu1.eng+stu1.math;
//		stu1.avg=stu1.total/3;
//		
//		Student stu2 = new Student ();
//		Student stu3 = new Student ();
//		System.out.println("Name\tNum\tKor\tEng\tMath\tTotal\tAvg");
//		System.out.println(stu1.name+"\t"+stu1.num+"\t"+stu1.kor+"\t"+stu1.eng+"\t"+stu1.math+"\t"+stu1.total+"\t"+stu1.avg);
		
		Student st = null;
		Student [] students = new Student [3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.name=sc.next();
			students[i]=st;
			System.out.println((i+1)+"번째 학생 이름: "+students[i].name);
		}
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println(st.name);
		
		System.out.println("프로그램 종료");

	}

}
