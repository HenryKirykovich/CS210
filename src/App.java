
import java.util.Scanner;

public class App {
	// Henadzi Kirykovich CS 210
	// 6/5/2025
	// Description: 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // external method for save input inside var
		boolean choice = false;
		int counter = 0;
		int minLength, maxLength;
								
		while (choice==false){
			
			System.out.print("Input min length of ID:");
			minLength = input.nextInt();
			System.out.print("Input max length of ID:");
			maxLength = input.nextInt();
			
			counter++;
			input.nextLine();
			
			
			System.out.print("Create a new ID:");
			String newId = input.nextLine();
			
			if (newId.length() >= minLength && newId.length() <= maxLength &
			newId.charAt(0) == newId.charAt(newId.length() - 1) )     
			{
				System.out.println(newId +" "+ "has been sucessfully created!");
				System.out.println("Number of attempts: " + counter);
				choice = true;
			} else
			{
				System.out.println("ID must be greater than or equal to 3 and less or equal to 5");
				System.out.println("The first character and the last character must be the same");
				System.out.println("Number of attempts: " + counter);
			}
			
		}
	}
}
