package com.patika.mustafa.java101.palindrom;

import java.util.Scanner;

public class PalindromWord {
	
	static void isPalindrome() {
		
		System.out.println("Lütfen Bir kelime giriniz");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char[] charArray = new char[word.length()];
		int count = 0;
		boolean check = true;
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			charArray[count] = word.charAt(i);
			if (word.charAt(count) != charArray[count]) {
				System.out.println("Girdiğiniz kelime Palindromik bir kelime DEğildir");
				
				check = false;
				break;
			}
			count++;
			
		}
		if (check) {
			System.out.println("Girdiğiniz kelime Palindromik bir kelimedir");
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		isPalindrome();
	}
}
