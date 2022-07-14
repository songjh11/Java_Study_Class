package com.iu.object1.ex1;

public class Student {
	//1-2 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public void setTotal() {
		this.total = this.kor+this.eng+this.math;
		this.setAvg();
		}

	private void setAvg() {
		this.avg = this.total/3.0;
	}
	
	private int checkPoint(int point) {
		if(point<0||point>100) {
			return 0;
		} else {
			return point;
		}
	}
}
