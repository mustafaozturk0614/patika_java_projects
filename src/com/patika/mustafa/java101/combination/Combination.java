package com.patika.mustafa.java101.combination;

import java.util.Scanner;

public class Combination {
	int n;
	int r;
	float c;
	
	public int factoriel(int n) {
		int factoriel = 1;
		for (int i = 1; i <= n; i++) {
			factoriel = factoriel * i;
			
		}
		
		return factoriel;
	}
	
	public void calculateCombination() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen  eleman sayısını(n) giriniz");
		n = scanner.nextInt();
		System.out.println("lütfen bulmak istediğiniz kombinasyon (r) sayısını giriniz");
		r = scanner.nextInt();
		if (n < r) {
			System.out.println("HATALI DEĞER GİRDİNİZ!! Elaman sayısı (n) Seçim sayısı (r) den KÜÇÜK OLAMAZ!!");
		} else {
			c = factoriel(n) / (factoriel(r) * factoriel(n - r));
			System.out.printf("%d nin %d'li kombinasyonu C(%d,%d) =  %.2f ", n, r, n, r, c);
		}
		
	}
	
	public static void main(String[] args) {
		Combination combination = new Combination();
		combination.calculateCombination();
	}
	
}
