package com.zookeeper;

public class Launcher {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		
		gorilla1.throwSomething().throwSomething().throwSomething().eatBanana().eatBanana().climb();
		
		GiantBat bat1 = new GiantBat();
		
		bat1.attackTown().attackTown().attackTown().eatHuman().eatHuman().fly();
	}

}
