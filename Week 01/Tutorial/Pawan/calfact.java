package test;

import java.util.Scanner;

public class calfact {
    public static void main(String args []) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = myscanner.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        
        myscanner.close();
    }
}