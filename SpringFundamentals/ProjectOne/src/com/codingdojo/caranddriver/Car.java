package com.codingdojo.caranddriver;

public class Car {
	private int gas;

	//Constructor
	public Car() {
		this.gas = 10;
	}
	
	//Getters/Setters
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	//Methods
	public int displayGas() {
		return this.getGas();
	}

}
