package com.codingdojo.caranddriver;

public class Driver extends Car{
	private int drive;
	private int boosters;
	private int refuel;
	
	//Constructor
	public Driver() {
		super();
		this.drive = 0;
		this.boosters = 0;
		this.refuel = 0;
	}
	
	//Getters/Setters
	public int getDrive() {
		return drive;
	}

	public void setDrive(int drive) {
		this.drive = drive;
	}

	public int getBoosters() {
		return boosters;
	}

	public void setBoosters(int boosters) {
		this.boosters = boosters;
	}

	public int getRefuel() {
		return refuel;
	}

	public void setRefuel(int refuel) {
		this.refuel = refuel;
	}
	
	//Methods
	
	public Driver drive(int distance) {
		this.setGas(this.getGas()- distance);
		return this;
	}
	
	public Driver boost() {
		this.setGas(this.getGas()- 3);
		return this;
	}
	
	public Driver refuel() {
		this.setGas(10);
		return this;
	}
}