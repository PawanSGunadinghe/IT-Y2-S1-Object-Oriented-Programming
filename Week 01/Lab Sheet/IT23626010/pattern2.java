public class pattern2{
	public static void main(String[] args){
	
		int n=5; //no of rows
		
		for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        // Print asterisks
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    
	}
}