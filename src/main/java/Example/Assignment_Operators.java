package Example;

public class Assignment_Operators {
	static int speed = 40;
	static int distance = 20;
	static int time = 10;
	static String name = "Vaibhav";
	static boolean isGood = true;
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("value stored in the speed variable is "+ speed);
		System.out.println("value stored in the distance variable is "+ distance);
		System.out.println("value stored in the time varibale is "+ time);
		System.out.println("value stored int the name varibale which is "+ name);
		System.out.println("value stored in the isGood varibale is "+ isGood);
		
		
		speed = 100;
		time = distance;
		name = "vaibhav Gaikwad";
		isGood = false;
		System.out.println();
		
		System.out.println("value stored in the speed variable is "+ speed);
		System.out.println("value stored in the distance variable is "+ distance);
		System.out.println("value stored in the time varibale is "+ time);
		System.out.println("value stored int the name varibale which is "+ name);
		System.out.println("value stored in the isGood varibale is "+ isGood);
		
		
		//illegal assignments
		
//		speed = ToolsQA;
//		name =10;
//		isGood = "TOOLS";

	}

}
