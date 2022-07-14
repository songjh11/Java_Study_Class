package com.iu.object4;

public class Car {

	String company="쌍용";//변수 선언과 동시에 초기화 
	String brand;
	String color;
	boolean gear; //true 오토 false 수동
	
	public void info() {
		System.out.println("Company: "+this.company); 
		System.out.println("Brand: "+this.brand);
		System.out.println("Color: "+this.color);
		System.out.println("Gear: "+this.gear);
	}
	
	//instance 초기화 블럭{}
//	{
//		this.company="기아";
//		this.brand="K5";
//		this.color="Black";
//		this.gear=false;
//	}
	//접근지정자 메서드명(클래스명과 동일) () {}
	public Car (String color) {
		this("펠레세이드","Black");
		this.company="쌍용";
		this.brand="아반떼";
		this.color=color;
		this.gear=true;
		
	}
	
	public Car(String brand, String color) {
		this.company="쌍용";
		this.brand=brand;
		this.color=color;
		this.gear=true;
	}
}
