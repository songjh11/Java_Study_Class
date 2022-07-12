package com.iu.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnimalSound as = new AnimalSound();
		System.out.println("1. 강아지 \t2. 고양이 \t3. 햄스터");
		int select = sc.nextInt();
		System.out.println("횟수 입력");
		int count = sc.nextInt();
				
		for(int i=0; i<count; i++) {
		if(select==1) {
			as.dogSound();
		} else if(select==2) {
			as.catSound();
		} else {
			as.hamSound();
						}
		}

	}

}
