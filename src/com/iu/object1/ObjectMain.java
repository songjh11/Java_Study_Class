package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//오브젝트 생성
		//클래스명 변수명 = new 클래스명(=생성자)();
		//데이터타입명 변수명
		Monster monster = new Monster (); //실제 데이터는 Heap영역에 저장되고 monster엔 주소가 저장됨. 참조형 변수=주소를 참조하겠다는 뜻!
		System.out.println(monster);//주소값 출력
		System.out.println(monster.name+"\t"+monster.level+"\t"+monster.hp);//초기값 출력
		//멤버변수 접근
		//변수명.멤버명
		monster.name = "고블린";
		monster.level = 5;
		monster.hp=100;
		//------------------------------------------------------
		Monster monster1 = new Monster();//새로운 Object 생성
		monster1.name="고블린";
		monster1.level=5;
		monster1.hp=100;
		
		System.out.println(monster.name+"\t"+monster.level+"\t"+monster.hp);
		System.out.println(monster1.name+"\t"+monster1.level+"\t"+monster1.hp);	
		System.out.println(monster==monster1);//세부값이 같더라도 주소가 다른 별개의 객체임
		
		Weapon sword= new Weapon();//sword의 데이터 타입은 weapon타입
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
		monster.weapon = sword;
		System.out.println(monster1.weapon.name);//weapon자체가 null; 그래서 에러 뜸
		
		monster.weapon.name = "고블린의 단검";
		System.out.println("name\tlevel\tHP\tWeapon");
		System.out.println(monster.name+"\t"+monster.level+"\t"+monster.hp+"\t"+monster.weapon.name);	

		System.out.println("프로그램 종료");

	}

}
