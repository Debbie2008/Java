package loop;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = b.nextInt();
		int factorial = 1;
		int i = 1;
		
		do {
			factorial = i * factorial;
			i ++;
		} while(i <= number);
		System.out.println("The facotiral of " + number + " is " + factorial);
		b.close();
					
			
		}
	}

