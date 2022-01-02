package com.patika.mustafa.java101.transpoz;

import java.util.Arrays;
import java.util.Scanner;

public class Transpoz {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] dizi = { { 2, 3, 4 }, { 5, 6, 4 } };
		
		int[][] transpoze = new int[dizi[0].length][dizi.length];
		
		for (int i = 0; i < dizi.length; i++) {
			
			for (int j = 0; j < transpoze.length; j++) {
				
				transpoze[j][i] = dizi[i][j];
				
			}
			
		}
		System.out.println("MATRİS:");
		for (int[] is : dizi) {
			
			for (int is2 : is) {
				System.out.print(is2 + " ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("TRANSPOZE:");
		for (int[] is : transpoze) {
			System.out.println(Arrays.toString(is));
		}
		
	}
}