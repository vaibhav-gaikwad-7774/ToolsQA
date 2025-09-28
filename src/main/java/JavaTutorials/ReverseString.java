package JavaTutorials;

public class ReverseString {
	public static void main(String[] args) {
		String str = "HTDigital";
		String Reverse = new StringBuilder(str).reverse().toString();
//		System.out.println(Reverse);
		
		System.out.println("The Reverse String of "+ str + " is " + Reverse);
	}

}
