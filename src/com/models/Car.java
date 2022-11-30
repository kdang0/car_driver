package com.models;

public class Car {
	private int gas = 10;
	public void displayGas() {
		System.out.println("Gas remaining " + this.gas+"/10");
	}
	public void handleGas(String type) {
		if(type == "drive") {
			System.out.println("You drive the car.");
			this.gas--;
		} else if(type == "boosters") {
			System.out.println("You boosted the car.");
			this.gas -= 3;
		} else if(type == "refuel") {
			System.out.println("You refueled the car.");
			this.gas += 2;
		}
	}
}
