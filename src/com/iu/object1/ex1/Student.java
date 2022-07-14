package com.iu.object1.ex1;

public class Student {
	//1-2 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void setTotal() {
		this.total = this.kor+this.eng+this.math;
		this.setAvg();
		System.out.println("");
	}

	public void setAvg() {
		this.avg = this.total/3.0;
	}
}
