
import java.util.Scanner;

public class App {
	// Henadzi Kirykovich CS 210
	// 6/5/2025
	// Description: Program for check ID by using condition 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // external method for save input inside var
		boolean choice = false;
		
		int minLength, maxLength;
		System.out.print("Input min length of ID: ");
		minLength = input.nextInt();
		System.out.print("Input max length of ID: ");
		maxLength = input.nextInt();
								
		while (!choice) { // loop until a valid ID is created

		
			
		
			System.out.println();
			input.nextLine(); // holder for new line
		
			System.out.print("Create a new ID: ");
			String newId = input.next();
		
			
		
			if (newId.length() < minLength || newId.length() > maxLength) {
				System.out.println("ID length must be between " + minLength + " and " + maxLength + ".");
				choice = false;
			}
		
			if (newId.charAt(0) != newId.charAt(newId.length() - 1)) {
				System.out.println("First and last characters must be the same.");
				choice = false;
			}
		
			if (newId.length() % 2 == 0) {
				System.out.println("ID length must be an odd number.");
				choice = false;
			} else  {
				System.out.println(newId + " has been successfully created!");
				choice = true;
			}
		}
	
		
	}
}
