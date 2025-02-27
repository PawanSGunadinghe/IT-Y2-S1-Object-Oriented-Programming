package test;

import java.util.Scanner;

public class table {
	 int number;
	 int range;
	 public static void main(String args []) {
		 Scanner myscanner = new Scanner(System.in);
        
		 System.out.print("Enter an integer: ");
		 int number = myscanner.nextInt();
        
		 System.out.print("Enter the range: ");
		 int range = myscanner.nextInt();
		 
		 System.out.print("\n");
		 
		 for (int i = 1; i <= range; i++) {
			 System.out.println(number + " x " + i + " = " + (number * i));
		 }
        
		 myscanner.close();
	 }

}
