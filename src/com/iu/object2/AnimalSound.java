package com.iu.object2;

public class AnimalSound {

	public void dogSound () {
		System.out.println("멍멍");
		catSound();	
		}
	public void catSound() {
		System.out.println("야옹");
		dogSound();
	} 
	public void hamSound() {
		System.out.println("찍찍");
	}
}
