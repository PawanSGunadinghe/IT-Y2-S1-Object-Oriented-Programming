import java.util.Scanner;
class Input
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = x.next();
        System.out.println("Your name is " +name); 

        System.out.println("Enter your age");
        int age = x.nextInt();
        System.out.println("Your age is " +age); 
    }
}