package com.codingdojo.caranddriver;

public class Launcher {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("Gas Level: "+car1.displayGas());
		
		Driver driver1 = new Driver();
		driver1.drive(5).boost().refuel().boost();
		System.out.println(driver1.getGas());

	}

}
