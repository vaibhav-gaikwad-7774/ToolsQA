package Constructors;

public class ConstructorTestExercise {

	public static void main(String[] args) {
		//Use the Car keyword to declare Car Class variable
		Car Toyota = new Car();;

		Toyota.iDoors = 4;
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		Toyota.bLeftHandDrive = true;

		//Using Car class method
		Toyota.DisplayCharacterstics();

	}

}