package com.patika.mustafa.java101.horoscope;

import java.util.Scanner;

public class FindHoroscope {
	/// * Burcu : 21 Mart - 20 Nisan
	//
	// Boğa Burcu : 21 Nisan - 21 Mayıs
	//
	// İkizler Burcu : 22 Mayıs - 22 Haziran
	//
	// Yengeç Burcu : 23 Haziran - 22 Temmuz
	//
	// Aslan Burcu : 23 Temmuz - 22 Ağustos
	//
	// Başak Burcu : 23 Ağustos - 22 Eylül
	//
	// Terazi Burcu : 23 Eylül - 22 Ekim
	//
	// Akrep Burcu : 23 Ekim - 21 Kasım
	//
	// Yay Burcu : 22 Kasım - 21 Aralık
	//
	// Oğlak Burcu : 22 Aralık - 21 Ocak
	// Kova Burcu : 22 Ocak - 19 Şubat
	//
	// Balık Burcu : 20 Şubat - 20 Mart
	// Switch -case kullanmadan
	
	public static void main(String[] args) {
		findHoroscope();
	}
	
	private static void findHoroscope() {
		String horoscope = " ";
		boolean kontrol = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen doğdunuz ayı sayı olarak giriniz");
		int month = scanner.nextInt();
		System.out.println("lütfen doğdunuz günü  giriniz");
		int day = scanner.nextInt();
		if (month == 1) {
			if (day <= 21) {
				horoscope = "Oğlak";
			} else if (day <= 31) {
				horoscope = "Kova";
				
			} else {
				kontrol = false;
			}
			
		} else if (month == 2) {
			if (day >= 1 && day <= 19) {
				horoscope = "Kova";
			} else if (day <= 28) {
				horoscope = "Balık";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 3)
		
		{
			if (day <= 20) {
				horoscope = "Balık";
			} else if (day <= 31) {
				
				horoscope = "Koç";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 4) {
			if (day <= 20) {
				horoscope = "Koç";
			} else if (day <= 30) {
				
				horoscope = "Boğa";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 5) {
			if (day <= 21) {
				horoscope = "Boğa";
			} else if (day <= 31) {
				horoscope = "İkizler";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 6) {
			if (day <= 22) {
				horoscope = "İkizler";
			} else if (day <= 30) {
				horoscope = "Yengeç";
			} else {
				kontrol = false;
			}
			
		}
		
		else if (month == 7) {
			if (day <= 22) {
				horoscope = "Yengeç";
			} else if (day <= 31) {
				horoscope = "Aslan";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 8) {
			if (day <= 22) {
				horoscope = "Aslan";
			} else if (day <= 31) {
				horoscope = "Başak";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 9) {
			if (day <= 22) {
				horoscope = "Başak";
			} else if (day <= 30) {
				horoscope = "Terazi";
			} else {
				kontrol = false;
			}
			
		} else if (month == 10) {
			if (day <= 22) {
				horoscope = "Terazi";
			} else if (day <= 30) {
				horoscope = "Akrep";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 11) {
			if (day <= 21) {
				horoscope = "Akrep";
			} else if (day <= 30) {
				horoscope = "Yay";
			}
			
			else {
				kontrol = false;
			}
			
		} else if (month == 12) {
			if (day <= 21) {
				horoscope = "Yay";
			} else if (day <= 31) {
				horoscope = "Oğlak";
			} else {
				kontrol = false;
			}
			
		} else {
			System.out.println("Yılda ki ay sayısı 12 adetdir lütfen 12 den büyük sayı GİRMEYİNİZ!!!");
		}
		
		if (kontrol) {
			System.out.println(horoscope);
		} else {
			System.out.println("lütfen geçerli bir değer giriniz Ayda ki gün sayısından fazla bir Değer girdiniz!!!");
		}
		scanner.close();
	}
	
}
