package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	public int[] makeRandom3() {
		//메소드 호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		int [] nums = new int[num];
		for(int i=0; i<nums.length; i++) {
		int num2 = rd.nextInt(50);
		nums[i]=num2;
				}
		return nums;
		
	}
	
	public int[] makeRandom2(int count) {
		Random rd = new Random();
		int [] nums = new int[count];
		
		for(int i=0; i<count; i++) {
			nums[i]=rd.nextInt(50);
		}
		
		return nums;
	}

	public int makeRandom(){
	Random random = new Random();
	int num = random.nextInt(50);
	//return 리턴하려고 하는 data
	return num;
		
	}
	public void info () {
		System.out.println("실행 후 그냥 종료");
	}
	
	public Account makeAccount() {
		//계좌 개설
		//통장 이름, 예금주명, 통장번호, 잔액 입력 받아서 리턴
		Scanner sc =new Scanner(System.in);
		Account cut = new Account();
		
		System.out.println("계좌명 입력");
		cut.title = sc.next();
		System.out.println("예금주명 입력");
		cut.host = sc.next();
		System.out.println("통장 번호 입력");
		cut.numbers = sc.next();
		System.out.println("통장 잔액 입력");
		cut.valance = sc.nextLong();
		
		return cut;
		
	}
}
