package com.iu.object2;

public class Method4 {

	//info
	//멤버들의 정보를 출력하는 메서드
	
	public void info (Member [] mems) {
		System.out.println("회원 정보 출력");
		System.out.println("Name\tAge\tEmail");
		for(int i=0; i<mems.length; i++) {
		System.out.println(mems[i].name+"\t"+mems[i].age+"\t"+mems[i].email);
	}
		mems = new Member[2];
	}
}
