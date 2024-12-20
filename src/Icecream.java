
import java.util.Scanner;


public class Icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.print("Welcome to my Ice Cream Truck!");
		
		
		do {
			System.out.println("Here is your ice cream! Enjoy!");
			System.out.print("Would you like one more cone?(Enter yes or no) ");
			answer = scanner.nextLine();
		} while (answer.equals("yes"));
		System.out.println("That's all your ice creams!");
		scanner.close();
		
	}

}
