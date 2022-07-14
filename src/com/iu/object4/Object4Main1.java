package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resume re = new Resume();
		Car car1 = new Car("기아","White");//기본 생성자 호출됨->컴파일할때 자동으로 생성자 만들어줌
//		car1.brand = "토레스";
//		car1.color = "Black";
		Car car2 = new Car("현대","Black");
		car1.info();
		car2.info();
		
		Car car3 = new Car("쌍용","Black");
		car3.info();
//		Car car4 = new Car();
		
		

	}

}
