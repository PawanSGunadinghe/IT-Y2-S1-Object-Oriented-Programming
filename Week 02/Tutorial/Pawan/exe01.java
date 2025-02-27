package week02Tutorial;

import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int mark1, mark2, mark3;
    private double average;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
        this.average = 0.0;
    }
    
    public void inputMarks(Scanner scanner) {
        System.out.print("Enter marks for subject 1: ");
        this.mark1 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 2: ");
        this.mark2 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 3: ");
        this.mark3 = scanner.nextInt();
        
        System.out.print("\n");
    }
    
    public void calculateAverage() {
        this.average = (mark1 + mark2 + mark3) / 3;
    }
    
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Average Marks: " + average);
    }
}

public class exe01 {
	public static void main(String args []) {
        Scanner myscanner = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int id = myscanner.nextInt();
        myscanner.nextLine(); 
        
        System.out.print("Enter Student Name: ");
        String name = myscanner.nextLine();
        
        Student student = new Student(id, name);
        
        student.inputMarks(myscanner);
        student.calculateAverage();
        student.displayDetails();
        
        myscanner.close();
    }
}
