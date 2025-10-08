package Example;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		while(count<20) {
			count = count+5;
			System.out.println("The count is ==> "+ count);
		}
		
		int countonce=25;
		System.out.println("next count");
		while(countonce < 25) {
			countonce = countonce + 5;
			System.out.println("The count is ==> "+ countonce);
		}

	}

}


//While loop is also a control structure like for loop which allows 
//you to repeat a task for a number of times. The only difference between 
//a while loop and for loop is that the for loop repeats the task for
// a specific number of times but the while loop repeats the task for 
// an unknown number of times. The syntax for the while loop is :