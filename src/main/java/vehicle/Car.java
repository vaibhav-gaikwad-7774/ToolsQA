package vehicle;
public class Car {
	public String sModel;
	public static int iHighspeed;
	public static int iSteering;
	public static int iWheels;
	public static int iDoors;
	
	public Car(){
		iSteering = 1;
		iWheels = 4;
	
	}
	
	public void DisplayCharacteristics()  {
		System.out.println("model of the car is " + sModel );
		System.out.println("the max speed of the car is "+ iHighspeed);
		System.out.println("the number of the steering is"+ iSteering);
	}  
	
	public static void DisplayStaticCharacteristics() {
		System.out.println("Max speed of the Car: " + iHighspeed);//Compile time error
        System.out.println("Number of Wheels in the Car: " + iWheels);
        System.out.println("Number of Steering in the Car: " + iSteering);
	}}