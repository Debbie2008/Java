

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = b.nextInt();
		int factorial = 1;
		int i;
		
		for (i = 1; i <= number; i ++) {
			factorial = factorial *i;
		}
		System.out.println("The facotiral of " + number + " is " + factorial);
		b.close();
	
		
		
	}

}
