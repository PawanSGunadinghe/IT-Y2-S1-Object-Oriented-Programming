public class ex5{
	public static void main(String args[]){		
	int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
		}
		System.out.println();
			
		for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		System.out.println();
		}
		}