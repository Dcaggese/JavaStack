package com.zookeeper;

public class Mammal {
	private int energyLevel;
	
	//Constructors
	public Mammal() {
		this.energyLevel = 100;
	}
	
	//Getters/Setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
		//this.energyLevel += energyLevel;
	}
	
	//Methods
	public Mammal displayEnergy() {
		System.out.println("Energy Level is: "+this.getEnergyLevel());
		return this;
	}
	
	}