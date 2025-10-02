package Example;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] aMake = {"BMW","AUDI", "TOYOTO", "SUZUKI", "HONDA"};
		
		int iLength = aMake.length;
		System.out.println("length of the array is -->"+ iLength);
		
		String sHonda = aMake[0];
		System.out.println("last value of the array"+ sHonda);
		
		for(int i = 0; i<=iLength-1; i++) {
			System.out.println("The value stored at position" + i + "in aMake array is -->"+aMake[i]);
		}

	}

}
