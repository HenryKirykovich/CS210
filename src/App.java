
import java.util.Scanner;

public class App {
	// Henadzi Kirykovich CS 210
	// 2/5/2025
	// Description: Quiz 6

	// Scanner size = new Scanner(System.in);  // external method for save input inside var
	
	public static void main(String[] args) {
		
		double pi = 3.14159265359;
		for (int i = 11; i>=1; i--) {
		  System.out.printf("%13."+i+"f\n", pi);
		}
		for (int i = 1; i<=11; i++) {
			System.out.printf("%13."+i+"f\n", pi);
		  }
		ifElseMystery(2, 5);
		ifElseMystery(5, 2);
		}
	  
		public static void ifElseMystery(int a, int b) {
		  if(a<b*2) { // 2 less than 5  
			a=a+2; // if so will be 2+2=4
			b=b-3;  // if so will be 5-3=2
		  }else if (a == b*2) {
			a = a * 2;
           b = b + 5;
		  } else {
			a = a - 3;
		  }
		  if (a >= 10 && b >= 10) {
			a = a - 10;
			b = b - 10;
		   }
		  System.out.println(a+""+b); // just concatenation string 4 2 bring 42
		}

}
