package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentDelete {
	
	public void delete(Student [] students) {
		Scanner sc = new Scanner(System.in);
		boolean check=false;
		int index=0;
		System.out.println("학생 번호 입력");
		int num = sc.nextInt();
		Student [] students2 = null;
		for(int i=0; i<students.length; i++) {
			if(num==students[i].getNum()) {
				check=!check;
				break;
			} 
				if(check) {
					students2 = new Student [students.length-1];
					for(int j=0; j<students.length; j++) {
						if(i==j) {
							break;
						}
						students2[index]=students[j];
						index++;
					}
					
					
				
				}else {
				System.out.println("해당 학생이 없습니다");
		}
	}

	}
}
