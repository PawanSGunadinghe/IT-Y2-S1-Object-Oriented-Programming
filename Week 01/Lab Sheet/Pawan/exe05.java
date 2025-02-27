package week01Lab;

public class exe05 {
	public static void main(String args []) {

        int i = 0;
        int size = 5;
        
        System.out.println("Using while loop:\n");
        while (i < size) {
            int j = 0;
            while (j < size) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }


        System.out.println("\nUsing for loop:\n");
        int rows = 5; 
        
        for (i = 1; i <= rows; i++) {

            for (int space= rows - i; space > 0; space--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
