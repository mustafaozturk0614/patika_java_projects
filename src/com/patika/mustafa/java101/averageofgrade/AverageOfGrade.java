package com.patika.mustafa.java101.averageofgrade;

import java.util.Scanner;

public class AverageOfGrade {
	public static void main(String[] args) {
		AverageOfGrade averageOfGrade = new AverageOfGrade();
		averageOfGrade.average();
	}
	
	public void average() {
		Scanner scanner = new Scanner(System.in);
		String[] dersler = { "Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik" };
		double temp, ort = 0;
		for (int i = 0; i < dersler.length;) {
			System.out.println("lütfen " + dersler[i] + " dersi notunuzu giriniz");
			temp = scanner.nextDouble();
			if (temp <= 100 & temp >= 0) {
				ort = ort + temp;
				i++;
			} else {
				System.out.println(" lütfen 0 ile 100 arası bir değer giriniz !!!!!!");
				System.out.println("------------------------------------------------");
				
			}
		}
		ort = ort / dersler.length;
		if (ort >= 55) {
			System.out.println("Geçtiniz not ortalamanız: " + ort);
			
		} else {
			System.out.println("kaldınız not ortalamanız " + ort);
		}
		scanner.close();
	}
}
