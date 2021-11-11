package com.patika.mustafa.java101.studentgradingsystem;

public class Main {
	
	public static void main(String[] args) {
		Course mat = new Course("Matematik", "MAT101", "MAT");
		Course fizik = new Course("Fizik", "FZK101", "FZK");
		Course kimya = new Course("Kimya", "KMY101", "KMY");
		
		Teacher t1 = new Teacher("Ahmet", "506", "MAT");
		Teacher t2 = new Teacher("Uğur", "507", "FZK");
		Teacher t3 = new Teacher("Songül", "508", "KMY");
		
		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		Student s1 = new Student("Mustafa", 3, "2443", mat, fizik, kimya);
		s1.addBulkExamNote(55, 42, 47);
		s1.addOpinionNote(60, 80, 70);
		s1.isPass();
		
		Student s2 = new Student("Julia", 3, "2211", mat, fizik, kimya);
		s2.addBulkExamNote(85, 59, 51);
		s1.addOpinionNote(90, 70, 60);
		s2.isPass();
		
		Student s3 = new Student("Simge", 3, "2453", mat, fizik, kimya);
		s3.addBulkExamNote(60, 48, 53);
		s1.addOpinionNote(80, 65, 75);
		s3.isPass();
		
	}
	
}
