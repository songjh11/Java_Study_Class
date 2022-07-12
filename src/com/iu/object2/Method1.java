package com.iu.object2;

public class Method1 {
		//멤버 변수 선언 공식<-외형적인 부분 설명
		//접근 지정자 [그외지정자] 데이터타입 변수명;<-그외지정자는 써도 되고 안써도 됨
	
		//멤버 메서드 선언 공식
		//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들을 선언]){
		//       실행할 코드 작성}
		//접근지정자: public
		//그외지정자: 삭제
		//리턴타입: void
		//메서드명: 각자 생성, 첫글자는 소문자로 시작
		//매개변수: 생략
	
		public void test() {//메서드 선언
			System.out.println("Test Method 실행");
			int num =10;
			System.out.println(num);
		}
		
}
