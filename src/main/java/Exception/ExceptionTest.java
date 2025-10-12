package Exception;

public class ExceptionTest {
	static double a[];
	public static void main(String[] args) {
		a = new double[4];
		printElement(4);
	}
	static void printElement(int i) {
		System.out.println("the 5th element is "+ a[i]);
	}

}
