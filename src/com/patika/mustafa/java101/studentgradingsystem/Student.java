package com.patika.mustafa.java101.studentgradingsystem;

public class Student {
	String name, stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double avarage;
	boolean isPass;
	
	Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		calcAvarage();
		this.isPass = false;
	}
	
	public Student(String name, String stuNo, int classes, double avarage, boolean isPass) {
		super();
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.avarage = avarage;
		this.isPass = isPass;
	}
	
	public void addBulkExamNote(int mat, int fizik, int kimya) {
		
		if (mat >= 0 && mat <= 100) {
			this.mat.note = mat;
		}
		
		if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}
		
		if (kimya >= 0 && kimya <= 100) {
			this.kimya.note = kimya;
		} else {
			System.out.println("lütfen 0 ile 100 arası bir not giriniz");
		}
		
	}
	
	public void isPass() {
		if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
			System.out.println("Notlar tam olarak girilmemiş");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.printf("Ortalama : %.2f \n", this.avarage);
			if (this.isPass) {
				System.out.println("Sınıfı Geçti. ");
			} else {
				System.out.println("Sınıfta Kaldı.");
			}
		}
	}
	
	public void addOpinionNote(int mat, int fizik, int kimya) {
		if (mat >= 0 && mat <= 100) {
			this.mat.opinionNote = mat;
		}
		
		if (fizik >= 0 && fizik <= 100) {
			this.fizik.opinionNote = fizik;
		}
		
		if (kimya >= 0 && kimya <= 100) {
			this.kimya.opinionNote = kimya;
		} else {
			System.out.println("lütfen 0 ile 100 arası bir not giriniz");
		}
		
	}
	
	public void calcAvarage() {
		this.fizik.note = (this.fizik.note * 0.8) + (this.fizik.opinionNote * 0.2);
		this.kimya.note = (this.kimya.note * 0.7) + (this.kimya.opinionNote * 0.3);
		this.mat.note = (this.mat.note * 0.9) + (this.mat.opinionNote * 0.1);
		
		this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3.0;
	}
	
	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}
	
	public void printNote() {
		System.out.println("=========================");
		System.out.println("Öğrenci : " + this.name);
		System.out.printf("Matematik Notu : %.2f\n", this.mat.note);
		System.out.printf("Fizik Notu : %.2f\n", this.fizik.note);
		System.out.printf("Kimya Notu : %.2f\n", this.kimya.note);
	}
}
