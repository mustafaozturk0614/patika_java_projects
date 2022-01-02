package com.patika.mustafa.java101.sortArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen dizinin boyutunu giriniz");
		int size = scanner.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("lütfen dizinin " + (i + 1) + ".elamanını giriniz");
			int number = scanner.nextInt();
			array[i] = number;
			
		}
		for (int i : array) {
			System.out.println(count + ".Dizi elemanı : " + i);
		}
		Arrays.sort(array);
		
		System.out.println("Sıralama" + Arrays.toString(array));
	}
	
}
