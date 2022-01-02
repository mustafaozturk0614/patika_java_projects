package com.patika.mustafa.java101.closenumber;

import java.util.Arrays;
import java.util.Scanner;

public class CloseNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arrray = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int[] array2 = new int[arrray.length + 1];
		
		array2 = Arrays.copyOfRange(arrray, 0, array2.length);
		
		System.out.println("lütfen bir sayı giriniz");
		int number = scanner.nextInt();
		array2[array2.length - 1] = number;
		Arrays.sort(array2);
		
		int i = Arrays.binarySearch(array2, number);
		System.out.println("Girilen sayıdan küçük en yakın sayı " + array2[i - 1]);
		System.out.println("Girilen sayıdan büyük en yakın sayı " + array2[i + 1]);
		scanner.close();
	}
	
}
