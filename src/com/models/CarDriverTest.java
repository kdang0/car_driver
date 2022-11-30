
package com.models;
public class CarDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		d.handleCar("drive");
		d.handleCar("drive");
		d.handleCar("drive");
		d.handleCar("drive");
		d.handleCar("boosters");
		d.handleCar("refuel");
		d.handleCar("refuel");
		d.handleCar("refuel");
		d.displayGas();
	}

}
