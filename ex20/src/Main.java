import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Website: ");
        String web = sc.nextLine();
        if (web.endsWith(".org"))
            System.out.println("This is an organizational Website");
        else if (web.endsWith(".com"))
            System.out.println("This is Commercial Website");
        else if (web.endsWith(".in"))
            System.out.println("This is a Indian Website");
    }
}