import java.util.Scanner;

public class ex7 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in); 

        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();

        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();

        int sum = num1 + num2;
        double average = sum / 2.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        obj.close();  
    }
}
