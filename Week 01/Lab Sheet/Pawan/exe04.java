/*Write a program to display the day of the week when you provide the value.
Expected Output
 Value of the day : 4
Day of the week : Thursday
Good Bye!
You must use “switch – case” statement.
Display “Invalid Day” when some invalid value is provided.
Message “Good Bye” must appear at last.*/

package week01Lab;

import java.util.Scanner;

public class exe04 {
	public static void main(String args []) {
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the value of the day: ");
		int day = myscanner.nextInt();
		
		String dayName;
		switch(day) {
		
		case 1 :
			dayName =  "Monday";
			break;
		case 2 :
			dayName =  "Tuesday";
			break;
		case 3 :
			dayName =  "Wednesday";
			break;
		case 4 :
			dayName =  "Thursday";
			break;
		case 5 :
			dayName =  "Friday";
			break;
		case 6 :
			dayName =  "Saturday";
			break;
		case 7 :
			dayName =  "Sunday";
			break;
		 default:
             dayName = "Invalid Day";
		}
		
		System.out.println("Day of the week: " + dayName);
	    System.out.println("Good Bye!");
	        
	    myscanner.close();
	}

}
