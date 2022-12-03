package com.zookeeper;

public class GiantBat extends Mammal {
	private int energyLevel;
	
	//Constructor
	public GiantBat() {
		super();
		this.energyLevel = 300;
	}
	
	//Getters/Setters
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//Methods
	public GiantBat fly() {
		this.setEnergyLevel(this.getEnergyLevel() - 50);
		System.out.println("Whoosh! The bat takes flight!");
		this.displayEnergy();
		return this;
	}
	
	public GiantBat eatHuman() {
		this.setEnergyLevel(this.getEnergyLevel() + 25);
		System.out.println("Bat devours a person!");
		this.displayEnergy();
		return this;
	}
	
	public GiantBat attackTown() {
		this.setEnergyLevel(this.getEnergyLevel() - 100);
		System.out.println("Bat attacks a nearby town!");
		this.displayEnergy();
		return this;
	}
	
}
