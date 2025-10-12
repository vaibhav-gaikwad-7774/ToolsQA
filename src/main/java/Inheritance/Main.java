package Inheritance;

//Parent Class (Base Class)
class Vehicle {
 int speed = 60;

 void start() {
     System.out.println("Vehicle started");
 }

 void stop() {
     System.out.println("Vehicle stopped");
 }
}

//Child Class (Derived Class)
class Car extends Vehicle {
 int wheels = 4;

 void displayInfo() {
     System.out.println("Car speed: " + speed);
     System.out.println("Car has " + wheels + " wheels");
 }
}

//Main Class
public class Main {
 public static void main(String[] args) {
     Car myCar = new Car();

     myCar.start();        // Inherited method from Vehicle
     myCar.displayInfo();  // Child's own method
     myCar.stop();         // Inherited method from Vehicle
 }
}
