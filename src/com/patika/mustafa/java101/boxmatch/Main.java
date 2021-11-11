package com.patika.mustafa.java101.boxmatch;

public class Main {
	public static void main(String[] args) {
		Fighter marc = new Fighter("Şamil", 17, 100, 98, 10);
		Fighter alex = new Fighter("Hüseyin", 13, 95, 85, 20);
		Ring r = new Ring(marc, alex, 80, 100);
		r.start();
	}
}
