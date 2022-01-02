package com.patika.mustafa.java101.repeatingevennumbers;

import java.util.Arrays;

public class FrequencyRepeatNumber {
	
	static boolean isFrequence(int[] arr, int n) {
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		
		for (int i = 0; i < n; i++) {
			
			if (visited[i] == true)
				continue;
			
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			if (count > 1) {
				System.out.println(arr[i] + " " + count);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int n = list.length;
		isFrequence(list, n);
		
	}
	
}
