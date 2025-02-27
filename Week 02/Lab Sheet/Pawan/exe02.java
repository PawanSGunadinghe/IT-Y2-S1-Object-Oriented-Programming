package week02Lab;

public class exe02 {
	 public static void main(String[] args) {

	        if (args.length < 3) {
	            System.out.println("<FirstName> <StudentID> <District>");
	            return;
	        }

	        String firstName = args[0];
	        String studentID = args[1];
	        String district = args[2];

	        System.out.println("DitNo : " + studentID);
	        System.out.println("Name : " + firstName);
	        System.out.println("District : " + district);
	    }
}



