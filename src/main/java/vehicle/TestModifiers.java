package vehicle;
	import vehicle.Car;

	public class TestModifiers {

	public static void main(String[] args) {
		Car Toyota = new Car();
		Toyota.sModel="Camry";
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 230;

		Toyota.DisplayCharacteristics(); //Compile Time Error
		}
	}