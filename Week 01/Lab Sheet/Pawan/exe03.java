/*Write a program to validate a given age of a person using if-else statements.
If age is greater than 18 it should print “Adult” otherwise print “Child”.
*/
package week01Lab;

import java.util.Scanner;

public class exe03 {
	public static void main(String args []) {
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age = myscanner.nextInt();
		
		if(age > 18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Child");
		}
		
		myscanner.close();
		
	}

}
