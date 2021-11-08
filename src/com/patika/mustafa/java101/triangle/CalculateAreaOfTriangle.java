package com.patika.mustafa.java101.triangle;

import java.util.Scanner;

public class CalculateAreaOfTriangle {
	
	public static void main(String[] args) {
		
		double side3, side1, side2, area, perimeter;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("birinci kenar uzunluğunu giriniz: ");
		side1 = scanner.nextDouble();
		System.out.println("ikinci kenar uzunluğunu giriniz: ");
		side2 = scanner.nextDouble();
		System.out.println("üçüncü kenar uzunluğunu giriniz: ");
		side3 = scanner.nextDouble();
		perimeter = (side1 + side2 + side3) / 2;
		area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
		
		System.out
				.println("kenar uzunlukarı " + side1 + " , " + side2 + "  ve " + side3 + " olan üçgenin alanı " + area);
		scanner.close();
	}
	
}
