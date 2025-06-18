import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ex4{
	public static void main(String args[]){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.print("Enter length : ");
				double length = Double.parseDouble(reader.readLine());
				
			System.out.print("Enter width : ");
				double width = Double.parseDouble(reader.readLine());
				
			System.out.print("Enter height : ");
				double height = Double.parseDouble(reader.readLine());
				
			double volume = length*width*height;
			System.out.print("Volume : " +volume);
		}
		
		catch(IOException c){
		System.out.print("An error occured while reading input.");
		}
		
		catch(NumberFormatException c){
		System.out.print("Invalid input.please enter a valid double value.");
		}
	}
}
