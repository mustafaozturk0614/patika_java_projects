package com.patika.mustafa.java101.calculator;

import java.util.Scanner;

public class Calculator {
	static Scanner scanner = new Scanner(System.in);
	private double sayi1;
	private double sayi2;
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.menu();
	}
	
	public void toplama() {
		System.out.println("lütfen birinci sayıyı giriniz: ");
		sayi1 = scanner.nextInt();
		System.out.println("lütfen ikinci sayıyı giriniz: ");
		sayi2 = scanner.nextInt();
		System.out.println("Toplama işlemi sonucu :" + (sayi1 + sayi2));
	}
	
	public void cıkarma() {
		System.out.println("lütfen birinci sayıyı giriniz: ");
		sayi1 = scanner.nextInt();
		System.out.println("lütfen ikinci sayıyı giriniz: ");
		sayi2 = scanner.nextInt();
		System.out.println("Çıkarma işlemi sonucu" + (sayi1 - sayi2));
		
	}
	
	public void bolme() {
		
		System.out.println("lütfen birinci sayıyı giriniz: ");
		sayi1 = scanner.nextInt();
		System.out.println("lütfen ikinci sayıyı giriniz: ");
		sayi2 = scanner.nextInt();
		
		if (sayi2 == 0) {
			System.out.println("bir sayı sıfıra bölünemez");
			
		} else {
			System.out.println("Bölme işelemi sonucu :" + (sayi1 / sayi2));
		}
		
	}
	
	public void carpma() {
		
		System.out.println("lütfen birinci sayıyı giriniz: ");
		sayi1 = scanner.nextInt();
		System.out.println("lütfen ikinci sayıyı giriniz: ");
		sayi2 = scanner.nextInt();
		System.out.println("Çarpma işelemi sonucu :" + (sayi1 * sayi2));
	}
	
	public void menu() {
		
		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Bölme");
		System.out.println("4-Çarpma");
		System.out.println("Lütfen bir işlem seçiniz");
		int input = scanner.nextInt();
		
		switch (input) {
			case 1:
				toplama();
				break;
			case 2:
				cıkarma();
				break;
			case 3:
				bolme();
				break;
			case 4:
				carpma();
				break;
			
			default:
				System.out.println("yanlış bir işlem seçtiniz");
				break;
		}
		
	}
	
}
