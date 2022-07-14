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
		System.out.println("Name: "+student.getName());
		System.out.println("Num: "+student.getNum());
		System.out.println("Kor: "+student.getKor());
		System.out.println("Eng: "+student.getEng());
		System.out.println("Math: "+student.getMath());
		
	}
	
	
	//viewAll
	//학생들의 정보를 받아서 출력만 하면 됨
	
	public void view(Student [] students) {//매개변수로 받아서 출력
		System.out.println("Name\tNum\tKor\tEng\tMath\tTotal\tAvg");
		for(int i=0; i<students.length; i++) {
		System.out.println(students[i].getName()+"\t"+students[i].getNum()+"\t"+students[i].getKor()+"\t"+students[i].getEng()+"\t"+students[i].getMath()+"\t"+students[i].getTotal()+"\t"+students[i].getAvg());
		}
}
}