import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Program to check Entered number is greater than or not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Given number is 456");
        System.out.println("Enter Your Number");
        int a=sc.nextInt();
        System.out.println(a>456);
    }
}