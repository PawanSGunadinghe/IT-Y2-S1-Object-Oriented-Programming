package week02Tutorial;

import java.util.Scanner;

class Point3D {
    private double x, y, z;
    
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

public class pointApp {
	 public static void main(String args []) {
	        Scanner myscanner = new Scanner(System.in);
	  
	        System.out.print("Enter x, y, z for first point: ");
	        double x1 = myscanner.nextDouble();
	        double y1 = myscanner.nextDouble();
	        double z1 = myscanner.nextDouble();
	        Point3D point1 = new Point3D(x1, y1, z1);
	        
	        /*Point3D p1 = new Point3D(1,2,3);        //test answer
	        double d1 = p1.distance();            
	        System.out.print("Distance 1 is: " + d1);*/
	         
	        System.out.print("Enter x, y, z for second point: ");
	        double x2 = myscanner.nextDouble();
	        double y2 = myscanner.nextDouble();
	        double z2 = myscanner.nextDouble();
	        Point3D point2 = new Point3D(x2, y2, z2);
	        
	        /*Point3D p2 = new Point3D(4,5,6);        //test answer
	        double d2 = p2.distance();
	        System.out.print("Distance 2 is: " + d2);*/
	        
	        System.out.println("Distance of first point from origin: " + point1.distance());
	        System.out.println("Distance of second point from origin: " + point2.distance());
	        
	        myscanner.close();
	    }

}
