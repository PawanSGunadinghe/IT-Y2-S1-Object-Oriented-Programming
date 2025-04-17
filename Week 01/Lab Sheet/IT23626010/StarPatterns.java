public class StarPatterns {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            // Square pattern
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            
            System.out.print("    "); // Space between patterns
            
            // Pyramid pattern
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
