package Example;

public class Passing_Array {
	public static void main(String[] args) {
		

		String [] aMake = {"BMW","AUDI", "TOYOTO", "SUZUKI", "HONDA"};
		
		int iLength = aMake.length;
		System.out.println("Length of the Array is " + iLength);
		
		
		String sBMW = aMake[0];
		System.out.println("first value of the Array is "+ sBMW );
		
		String sHonda = aMake[iLength-1];
		System.out.println("Last value of the Array is "+ sHonda);
		
		for(int i = 0; i<=iLength-1; i++ ) {
			System.out.println("The value stored at position "+ i + " in aMake array is "+ aMake[i]);
		}
		
		

	}

}
