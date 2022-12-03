package com.zookeeper;

public class Gorilla extends Mammal {
	
	//Constructor
	public Gorilla() {
		super();
	}
	
	//Methods
	public Gorilla throwSomething() {
		this.setEnergyLevel(this.getEnergyLevel() - 5);
		System.out.println("Gorilla threw something! Watch out!");
		this.displayEnergy();
		return this;
	}
	
	public Gorilla eatBanana() {
		this.setEnergyLevel(this.getEnergyLevel() + 10);
		System.out.println("Gorilla ate a Banana. It got an energy boost!");
		this.displayEnergy();
		return this;
	}
	
	public Gorilla climb() {
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		System.out.println("Gorilla has climbed a tree! That was tiring!");
		this.displayEnergy();
		return this;
	}
}
