package test;

import java.util.Scanner;

public class calavg {
	 public static void main(String args [] ) {
	        Scanner myscanner = new Scanner(System.in);
	        int sum = 0;
	        int count = 0;
	        int number;

	        System.out.println("Enter a series of numbers (terminate by entering a negative number)");

	        while (true) {
	            System.out.print("Enter a number: ");
	            number = myscanner.nextInt();
	            if (number < 0) {
	                break;
	            }

	            sum += number;
	            count++;
	        }

	        if (count > 0) {
	            double average = (double) (sum / count);
	            System.out.printf("Average of the entered numbers is: %.2f%n", average);
	        } 
	        
	        else {
	            System.out.println("No valid numbers were entered.");
	        }

	        myscanner.close();
	    }

}
