package com.patika.mustafa.java101.suggestanevent;

import java.util.Scanner;

public class SuggestAnEvent {
	
	public static void main(String[] args) {
		suggestion();
		
	}
	
	private static void suggestion() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir sıcaklık değeri giriniz");
		int heat = scanner.nextInt();
		
		if (heat < 5) {
			
			System.out.println("kayak yapabilirsiniz");
		} else if (heat <= 25) {
			if (heat <= 9) {
				System.out.println("Sinemaya gidebilrisiniz");
			} else if (heat >= 10 && heat <= 15) {
				System.out.println("Sinemaya gidebilrisiniz");
				System.out.println("Pikniğe gidebilirsiniz");
			} else {
				System.out.println("Pikniğe gidebilirsiniz");
			}
			
		} else {
			System.out.println("Yüzmeye gidebilirsiniz");
		}
		scanner.close();
	}
	
}
