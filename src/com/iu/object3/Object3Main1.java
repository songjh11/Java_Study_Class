package com.iu.object3;

public class Object3Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnTest rt = new ReturnTest();
		
		int num=rt.makeRandom();
		System.out.println(num);
		
		rt.info();
		int [] nums = rt.makeRandom2(5);
		for(int i =0; i<nums.length; i++) {
		System.out.println(nums[i]);
			}
		nums = rt.makeRandom3();
		for(int i =0; i<nums.length; i++) {
		System.out.println(nums[i]);
			}
		Account cut = rt.makeAccount();//주소를 리턴받음
		System.out.println(cut.title);
		System.out.println(cut.host);
		System.out.println(cut.numbers);
		System.out.println(cut.valance);
	}
}
