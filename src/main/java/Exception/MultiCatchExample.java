package Exception;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			int[] numbers = {10, 20, 30};
			System.out.println(numbers[3]);
		}catch(ArithmeticException e) {
			System.out.println("arithmentic error occurd");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index outofbonds!");
		}catch (Exception e) {
			System.out.println("some other exception occurred" + e); 
		}finally {
			System.out.println("program executed successfully");
		}
	}

}
