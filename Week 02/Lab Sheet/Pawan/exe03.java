package week02Lab;

import java.util.Scanner;

public class exe03 {
	 public static void main(String args []) {
	
	        Scanner myscanner = new Scanner(System.in);
	        
	        System.out.print("Enter the length of the cube: ");
	        double length = myscanner.nextDouble();
	        
	        System.out.print("Enter the width of the cube: ");
	        double width = myscanner.nextDouble();
	        
	        System.out.print("Enter the height of the cube: ");
	        double height = myscanner.nextDouble();
	        
	        double volume = length * width * height;
	        
	        System.out.println("The volume of the cube is: " + volume);
	        
	        myscanner.close();
	    }

}
