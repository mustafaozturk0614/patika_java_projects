package com.patika.mustafa.java101.chinesezodiac;

import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String[] args) {
		findZodiac();
		
	}
	
	private static void findZodiac() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen doğum yılınızı şu şekilde (1990) giriniz");
		int birhtYear = scanner.nextInt();
		int mod = birhtYear % 12;
		String zodiac = "";
		
		switch (mod) {
			case 0:
				zodiac = "Maymun";
				break;
			case 1:
				zodiac = "Horoz";
				break;
			case 2:
				zodiac = "Köpek";
				break;
			case 3:
				zodiac = "Domuz";
				break;
			case 4:
				zodiac = "Fare";
				break;
			case 5:
				zodiac = "Öküz";
				break;
			case 6:
				zodiac = "Kaplan";
				break;
			case 7:
				zodiac = "Tavşan";
				break;
			case 8:
				zodiac = "Ejderha";
				break;
			case 9:
				zodiac = "Yılan";
				break;
			case 10:
				zodiac = "At";
				break;
			case 11:
				zodiac = "Koyun";
				break;
			
			default:
				break;
		}
		
		System.out.println("Çin Zodyağınız= " + zodiac);
		scanner.close();
	}
}
