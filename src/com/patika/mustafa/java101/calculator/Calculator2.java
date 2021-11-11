package com.patika.mustafa.java101.calculator;

import java.util.Scanner;

public class Calculator2 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int select() {
		Scanner scanner = new Scanner(System.in);
		int select;
		String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n"
				+ "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabı\n" + "0- Çıkış Yap";
		System.out.println("\n\t\t=HESAP MAKİNESİ=\n");
		System.out.println(menu);
		System.out.println("Lütfen bir seçim yapınız: ");
		select = scanner.nextInt();
		return select;
		
	}
	
	public static void proces() {
		int select;
		while (true) {
			select = select();
			switch (select) {
				case 1:
					plus();
					break;
				case 2:
					minus();
					break;
				case 3:
					multiplication();
					break;
				case 4:
					
					division();
					break;
				case 5:
					power();
					break;
				case 6:
					factorial();
					break;
				case 7:
					mod();
					break;
				case 8:
					rectanglePerimeterAndArea();
					break;
				
				case 0:
					System.out.println("Sistemden çıkılıyor...");
					System.exit(0);
					break;
				
				default:
					break;
			}
			
		}
		
	}
	
	private static void rectanglePerimeterAndArea() {
		int perimeter;
		int area;
		System.out.println("Lütfen Dikdörtgenin uzun kenar değerini giriniz: ");
		int longSide = scanner.nextInt();
		System.out.println("Lütfen Dikdörtgenin kısa kenar değerini giriniz:");
		int shortSize = scanner.nextInt();
		perimeter = (longSide + shortSize) * 2;
		area = longSide * shortSize;
		System.out.println("Dikdörtgenin alanı =" + area);
		System.out.println("Dikdörtgenin çevresi =" + perimeter);
		
	}
	
	private static void mod() {
		int result = 0;
		int temp;
		System.out.println("Lütfen Bir modu alınacak bir sayı  değerini giriniz: ");
		int number = scanner.nextInt();
		System.out.println("Lütfen Bir mod değerini giriniz:");
		int mod = scanner.nextInt();
		temp = number;
		for (int i = 0; i < number; i++) {
			
			if (temp > mod) {
				temp = temp - mod;
				
			} else if (temp == mod) {
				temp = temp - mod;
				result = temp;
				
			}
			
			else if (temp < mod) {
				result = temp;
				
			}
			
		}
		System.out.println("Sonuç : " + result);
	}
	
	private static void factorial() {
		
		System.out.print(" Lütfen bir sayı giriniz :");
		int number = scanner.nextInt();
		int result = 1;
		
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		
		System.out.println();
		System.out.println("Sonuç= " + result);
	}
	
	private static void power() {
		int result = 1;
		
		System.out.println("Lütfen Bir taban değerini giriniz: ");
		int taban = scanner.nextInt();
		System.out.println("Lütfen Bir üs değerini giriniz:");
		int us = scanner.nextInt();
		for (int i = 0; i < us; i++) {
			result = taban * result;
			
		}
		System.out.println("sonuç=" + result);
		
	}
	
	private static void division() {
		double result = 0;
		int count = 0;
		while (true) {
			count++;
			System.out.println("Lütfen Bir sayı giriniz işlemi sonlandırmak için '=' tuşuna basınız ");
			String number = scanner.nextLine();
			if (number.equalsIgnoreCase("=")) {
				System.out.println("sonuç= " + result);
				break;
			} else {
				
				if (count == 1) {
					result = Double.parseDouble(number);
				} else {
					if (number.equalsIgnoreCase("0")) {
						System.out.println("BİR SAYI SIFIRA BÖLÜNEMEZ!!!");
						System.out.println("DEĞERLERİ TEKRARDAN GİRİNİZ!");
						
						count = 0;
						continue;
					}
					result /= Double.parseDouble(number);
				}
			}
			
		}
		
	}
	
	private static void multiplication() {
		int result = 1;
		while (true) {
			System.out.println("Lütfen Bir sayı giriniz işlemi sonlandırmak için '=' tuşuna basınız ");
			String number = scanner.nextLine();
			if (number.equalsIgnoreCase("=")) {
				System.out.println("sonuç= " + result);
				break;
			} else {
				result *= Integer.parseInt(number);
				
			}
			
		}
		
	}
	
	private static void minus() {
		int result = 0;
		int count = 0;
		while (true) {
			count++;
			System.out.println("Lütfen Bir sayı giriniz işlemi sonlandırmak için '=' tuşuna basınız ");
			String number = scanner.nextLine();
			if (number.equalsIgnoreCase("=")) {
				System.out.println("sonuç= " + result);
				break;
			} else {
				if (count == 1) {
					result += Integer.parseInt(number);
				} else {
					result -= Integer.parseInt(number);
				}
			}
			
		}
		
	}
	
	private static void plus() {
		int sum = 0;
		while (true) {
			System.out.println("Lütfen Bir sayı giriniz işlemi sonlandırmak için '=' tuşuna basınız ");
			String number = scanner.nextLine();
			if (number.equalsIgnoreCase("=")) {
				System.out.println("sonuç= " + sum);
				break;
			} else {
				sum += Integer.parseInt(number);
				
			}
			
		}
		
	}
	
	public static boolean desicion() {
		boolean desicon = true;
		System.out.println("Devam etmek istiyorsanız Herhangi bir tuşa Çıkmak İstiyorsanız 'q' tuşuna basınız");
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("q")) {
			desicon = false;
			
		}
		return desicon;
	}
	
	public static void main(String[] args) {
		
		proces();
		
	}
	
}
