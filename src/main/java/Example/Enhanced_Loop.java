package Example;

public class Enhanced_Loop {

	public static void main(String[] args) {
		
		String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
		
		for(String dayName : days) {
			System.out.println("Days ==>"+ dayName);
		}
		
		System.out.println("normal for loop");
		for(int i = 0; i<days.length; i++) {
			System.out.println("Days ==> "+ days[i]);
		}
 
	}

}
