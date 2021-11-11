package com.patika.mustafa.java101.studentgradingsystem;

public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	double note;
	double opinionNote;
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.opinionNote = 0;
	}
	
	public void addTeacher(Teacher teacher) {
		if (this.prefix.equalsIgnoreCase(teacher.branch)) {
			this.courseTeacher = teacher;
			System.out.println("İşlem başarılı");
		} else {
			System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
		}
	}
	
	public void printTeacher() {
		if (courseTeacher != null) {
			System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
		} else {
			System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
		}
	}
}
