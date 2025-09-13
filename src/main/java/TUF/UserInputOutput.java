package TUF;

import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        int num = sc.nextInt();

        System.out.println(num);
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();
		
		sol.printNumber(sc);
		
		sc.close();
	}
}

// import java.util.Scanner;

// class Solution {
//     public void printNumber(Scanner sc) {
//         // Taking input
//         int num = sc.nextInt();
        
//         // Printing the number
//         System.out.print(num);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Solution sol = new Solution();
        
//         // Calling the function
//         sol.printNumber(sc);
        
//         sc.close();
//     }
// }
