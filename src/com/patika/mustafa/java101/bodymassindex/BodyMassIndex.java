package com.patika.mustafa.java101.bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {
	
	public static void main(String[] args) {
		BodyMassIndex bodyMassIndex = new BodyMassIndex();
		bodyMassIndex.calculateIndex();
	}
	
	public void calculateIndex() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
		float height = scanner.nextFloat();
		
		System.out.println("Lütfen kilonuzu giriniz :");
		float weight = scanner.nextFloat();
		
		float index = (float) (weight / (Math.pow(height, 2)));
		System.out.println("Vücüt Kütle indeksiniz :" + index);
		
		scanner.close();
		
	}
	
}
