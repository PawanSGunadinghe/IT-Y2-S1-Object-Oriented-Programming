import java.util.Scanner;

class EvenOddNumber{
	public boolean findEvenOrOdd(int i){
		boolean result = (i % 2 == 0) ? true : false;
		return result;
	}
}

public class Demo{
	public static void main(String args[]){
		Scanner Obj = new Scanner(System.in);
		EvenOddNumber evenOddNumber = new EvenOddNumber();
		
		System.out.print("Enter a number : ");
		int num = Obj.nextInt();
		
		boolean result = evenOddNumber.findEvenOrOdd(num);
		
		if(result){
			System.out.println(num+ "is an even number.");
		}
		else{
			System.out.println(num+ "is an odd number.");
		}
		
		Obj.close();
	}
}