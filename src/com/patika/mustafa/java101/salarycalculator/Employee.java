package com.patika.mustafa.java101.salarycalculator;

// Sınıfın Nitelikleri
//
// name : Çalışanın adı ve soyadı
// salary : Çalışanın maaşı
// workHours : Haftalık çalışma saati
// hireYear : İşe başlangıç yılı
// Sınıfın Metotları
//
// Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre
// alacaktır.
// tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
// Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
// Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi
// uygulanacaktır.
// bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan
// çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri
// hesaplayacaktır.
// raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını
// hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
// Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam
// yapılacaktır.
// Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam
// yapılacaktır.
// Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
// toString() : Çalışana ait bilgileri ekrana bastıracaktır.
public class Employee {
	String name;
	double salary;
	double workHours;
	int hireYear;
	double takeSalary;
	
	public Employee(String name, double salary, double workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.takeSalary = salary;
		
	}
	
	public double tax() {
		double tax = 0;
		if (this.salary >= 1000) {
			tax = (this.salary * 3 / 100);
			this.takeSalary = this.takeSalary - tax;
			return tax;
		} else {
			return tax;
		}
		
	}
	
	public double bonus() {
		double bonus = 0;
		if (workHours > 40) {
			
			bonus = (this.workHours - 40) * 30;
			
			this.takeSalary = this.takeSalary + bonus;
			return bonus;
			
		} else {
			return bonus;
		}
		
	}
	
	public double raiseSalary() {
		double raiseSalary = 0;
		int workingYear = 2021 - hireYear;
		if (workingYear < 10) {
			raiseSalary = this.salary * 5 / 100;
			return raiseSalary;
		} else if (workingYear >= 10 && workingYear < 20) {
			raiseSalary = this.salary * 1 / 10;
			
			return raiseSalary;
		} else {
			
			raiseSalary = this.salary * 15 / 100;
			
			return raiseSalary;
		}
		
	}
	
	@Override
	public String toString() {
		return "Adı;" + name + "\n" + "Çalışma Saati : " + workHours + "\n" + "Başlangıç Yılı: " + hireYear + "\n"
				+ "Vergi : " + tax() + "\n" + "Bonus: " + bonus() + "\n" + "Maaş Artışı: " + raiseSalary() + "\n"
				+ "Vergi ve Bonuslar ile birlikte maaş :" + (takeSalary) + "\n" + "Toplam Maaş :"
				+ (takeSalary + raiseSalary());
		
	}
	
}
