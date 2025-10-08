package Example;

public class Continue_Loop {

	public static void main(String[] args) {
		for(int i = 0; i<=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println("count is ==> "+ i);
		}
		
		System.out.println("the next count");
		
		for(int j=0; j<=5; j++) {
			if(j==4) {
				continue;
			}
			System.out.println("The count is ==>"+ j);
		}
	
	
	
	
	
	}
}

//The continue keyword - The continue keyword helps to avoid the 
//execution of the body of the loop in some specific situation. 
//Like break, when you like to jump out of the loop, there may 
//be some situation when you just want to skip some condition. 
//The continue keyword causes the loop to immediately jump to the 
//next iteration of the loop and it can be used in any of the loop control structures.
