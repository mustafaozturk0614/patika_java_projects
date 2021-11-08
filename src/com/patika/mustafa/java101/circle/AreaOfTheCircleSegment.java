package com.patika.mustafa.java101.circle;

import java.util.Scanner;

public class AreaOfTheCircleSegment {
	private final double PI = 3.14;
	private final double CIRCLEDEGREE = 360;
	private double radius;
	private double centerAngle;
	private double segmentArea;
	
	public void calculateSegmentArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen dairenin yarıçapını giriniz");
		radius = scanner.nextDouble();
		System.out.println("lütfen dairenin merkez açısının ölçüsünü giriniz");
		centerAngle = scanner.nextDouble();
		segmentArea = (PI * Math.pow(radius, 2) * centerAngle) / CIRCLEDEGREE;
		System.out.println("merkez açısının ölçüsü " + centerAngle + " olan daire diliminin alanı: " + segmentArea);
		
	}
	
	public static void main(String[] args) {
		AreaOfTheCircleSegment areaOfTheCircleSegment = new AreaOfTheCircleSegment();
		areaOfTheCircleSegment.calculateSegmentArea();
	}
	
}
