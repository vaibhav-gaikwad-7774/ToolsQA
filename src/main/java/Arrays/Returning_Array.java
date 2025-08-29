package Arrays;

public class Returning_Array {
	
	public static void main(String[] args) {
		String[] aMake = returnArray();
		for(int i = 0; i<aMake.length-1; i++) {
			System.out.println("printing the all values of Array = " + aMake[i]);
		}
		
	}

	public static String[] returnArray() {
		String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"}; 
		return aArray;
	}

}
