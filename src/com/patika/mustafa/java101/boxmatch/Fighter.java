package com.patika.mustafa.java101.boxmatch;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	double dodge;
	
	public Fighter(String name, int damage, int health, int weight, double dodge) {
		super();
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
	}
	
	public boolean dodge() {
		double randomValue = Math.random() * 100; // 0.0 to 99.9
		return randomValue <= this.dodge;
	}
	
	public int hit(Fighter f) {
		System.out.println("------------");
		System.out.println(this.name + " => " + f.name + " " + this.damage + " hasar vurdu.");
		
		if (f.dodge()) {
			System.out.println(f.name + " gelen hasarı savurdu.");
			return f.health;
		}
		
		if (f.health - this.damage < 0)
			return 0;
		
		return f.health - this.damage;
	}
}
