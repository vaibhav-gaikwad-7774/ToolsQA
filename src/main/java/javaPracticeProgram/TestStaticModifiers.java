package javaPracticeProgram;

import vehicle.Car;

public class TestStaticModifiers {
	public static void main(String[] args) {
		Car Toyota = new Car();
		Toyota.sModel = "camry";
		Toyota.iHighspeed = 230;
		Car.iDoors = 2;
		
		System.out.println("model of the car is "+ Toyota.sModel);
		System.out.println("speed of the car is "+ Toyota.iHighspeed);
		System.out.println("number of doors of the car is "+ Toyota.iDoors);
		System.out.println(Toyota.iWheels);
		System.out.println(Car.iWheels);
		System.out.println("the number of the doors in the car will be" + Car.iDoors);
		
		
		
	}
}
