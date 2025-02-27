package week01Lab;

import java.util.Scanner;

public class exe07 {
	public static void main(String args []) {
		Scanner myscanner = new Scanner(System.in);
		
		int num1 , num2;
		
		System.out.println("Enter nmber 1: ");
		num1 = myscanner.nextInt();
		
		System.out.println("Enter nmber 2: ");
		num2 = myscanner.nextInt();
		
		int sum = num1 + num2;
		double avg = (sum / 2);
		
		System.out.println("Sum is: " +sum);
		System.out.println("Average is: " +avg);
		
		myscanner.close();
	}

}
