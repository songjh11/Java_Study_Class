package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name = "Kim";
		member.age=30;
		member.email="kimkim1234@gmail.com";
		
		Member member2 = new Member();
		member2.name = "Lee";
		member2.age = 26;
		member2.email = "leesm935@gmail.com";
		
		Member member3 = new Member();
		member3.name = "Choi";
		member3.age = 45;
		member3.email = "cbh@gmail.com";
		
		Member [] mems = new Member[3];
		mems[0] = member;
		mems[1] = member2;
		mems[2] = member3;
		
		Method4 m1 = new Method4();
		
		m1.info(mems);
		
		System.out.println(mems.length);

	}

}
