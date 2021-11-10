package com.patika.mustafa.java101.powernumbers;

import java.util.Scanner;

public class PowerNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen üssü alınacak sayıyı giriniz ");
		int taban = scanner.nextInt();
		System.out.println("lütfen üs olacak sayıyı giriniz ");
		int üs = scanner.nextInt();
		int sonuc = 1;
		
		if (taban == 0) {
			System.out.println("taban sayımız 0 olduğu için sonuç = 0 dır. ");
			
		} else if (üs == 0) {
			System.out.println("üs sayımız 0 olduğu için sonuç= 1 dir.");
			
		} else {
			for (int i = 1; i <= üs; i++) {
				sonuc = sonuc * taban;
				
			}
			System.out.printf("%d sayısının %d üssü= %d ", taban, üs, sonuc);
		}
		scanner.close();
	}
}
