package com.patika.mustafa.java101;

import java.util.Scanner;

public class CalculateAverageOfGrade {
	
	public static void main(String[] args) {
		double matematik, fizik, kimya, türkçe, tarih, muzik, ort;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen Matematik dersi notunuzu giriniz");
		matematik = scanner.nextDouble();
		System.out.println("lütfen Fizikdersi notunuzu giriniz");
		fizik = scanner.nextDouble();
		System.out.println("lütfen Kimyaya dersi notunuzu giriniz");
		kimya = scanner.nextDouble();
		System.out.println("lütfen Türkçe dersi notunuzu giriniz");
		türkçe = scanner.nextDouble();
		System.out.println("lütfen Tarih dersi notunuzu giriniz");
		tarih = scanner.nextDouble();
		System.out.println("lütfen Müzik dersi notunuzu giriniz");
		muzik = scanner.nextDouble();
		ort = (matematik + fizik + kimya + türkçe + tarih + muzik) / 6;
		String sonuc = (ort >= 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
		
		System.out.println(sonuc + " not ortalamanız :" + ort);
		scanner.close();
	}
	
}
