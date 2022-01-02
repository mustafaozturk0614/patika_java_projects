package com.patika.mustafa.java101.findfrequency;

import java.util.Arrays;

public class FindFrequency {
	
	public static void main(String[] args) {
		
		int[] dizi = { 10, 20, 20, 10, 10, 15, 15, 20 };
		boolean[] dizi2 = new boolean[dizi.length];
		int count = 1;
		
		Arrays.fill(dizi2, false);
		
		for (int i = 0; i < dizi.length; i++) {
			count = 1;
			
			if (dizi2[i] == true) {
				continue;
			}
			for (int j = 0; j < dizi.length; j++) {
				
				if (i != j && dizi[i] == dizi[j]) {
					if (dizi2[j] == false) {
						dizi2[j] = true;
						
						count++;
						
					}
					
				}
			}
			System.out.println(" " + dizi[i] + " = " + count + " tane var\n");
		}
		
	}
	
}
