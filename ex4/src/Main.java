import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("What is Your Name");
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " +name+ " have a Nice Day");
    }
}