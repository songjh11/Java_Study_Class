package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentView {

	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	
	public void view(String string) {
		System.out.println(string);
	}
	
	//viewOne
	//학생 한명의 정보를 받아서 모든 정보를 출력
	
	public void view(Student student) {
		System.out.println("Name: "+student.name);
		System.out.println("Num: "+student.num);
		System.out.println("Kor: "+student.kor);
		System.out.println("Eng: "+student.eng);
		System.out.println("Math: "+student.math);
		
	}
	
	
	//viewAll
	//학생들의 정보를 받아서 출력만 하면 됨
	
	public void view(Student [] students) {//매개변수로 받아서 출력
		System.out.println("Name\tNum\tKor\tEng\tMath\tTotal\tAvg");
		for(int i=0; i<students.length; i++) {
		System.out.println(students[i].name+"\t"+students[i].num+"\t"+students[i].kor+"\t"+students[i].eng+"\t"+students[i].math+"\t"+students[i].total+"\t"+students[i].avg);
		}
}
}