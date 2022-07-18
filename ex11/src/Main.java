import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter upper case string:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Convert into lower case string:  " +name.toLowerCase());
    }
}