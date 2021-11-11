package com.patika.mustafa.java101.desingrecursive;

public class DesingRecursive {
	
	public static void desing(int number, int temp, boolean down) {
		
		System.out.print(" " + temp);
		if (temp <= 0) {
			down = false;
		}
		int temp2;
		if (down) {
			temp2 = temp - 5;
		} else {
			temp2 = temp + 5;
		}
		
		if (temp2 <= number) {
			desing(number, temp2, down);
		}
		
	}
	
	public static void main(String[] args) {
		desing(16, 16, true);
	}
}
