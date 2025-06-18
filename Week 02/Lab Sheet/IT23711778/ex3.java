import java.util.Scanner;

public class ex3{
	
	public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	
	System.out.print("Enter length : ");
	double length = obj.nextDouble();
	
	System.out.print("Enter width : ");
	double width = obj.nextDouble();
	
	System.out.print("Enter height : ");
	double height = obj.nextDouble();
	
	double volume = length*width*height;
	
	System.out.println("Volume of cube : " +volume);	
	}
}
