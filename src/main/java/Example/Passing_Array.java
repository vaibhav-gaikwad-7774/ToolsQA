package Example;


public class Passing_Array {
	public static void main(String[] args) {
		
		String[] aMake = {"BMW", "jhsb", "jhbfk", "trur"};
		Print_Array(aMake);
		

	}
	
	public static void Print_Array(String[] array) {
		for(int i = 0; i<=array.length-1; i++) {
			System.out.println("printing all values from an array"+ array[i]);
			
		}
		
	}

}
