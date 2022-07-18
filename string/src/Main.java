import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter Anything:");
        Scanner sc= new Scanner(System.in);
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}