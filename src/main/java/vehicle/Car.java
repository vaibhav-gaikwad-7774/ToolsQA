package vehicle;
    public class Car {
	public String sModel;
	public int iGear;
	public int iHighestSpeed;

	public void DisplayCharacterstics(){
		System.out.println("Model of the Car: " + sModel);
		System.out.println("Number of gears in the Car: " + iGear);
		System.out.println("Max speed of the Car: " + iHighestSpeed);
		}
	}