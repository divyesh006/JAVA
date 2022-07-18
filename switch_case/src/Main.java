import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are in 18");
                break;
            case 22:
                System.out.println("You are in 22");
                break;
            case 30:
                System.out.println("You are in 30");
                break;
            case 40:
                System.out.println("You are in 40");
                break;
            case 45:
                System.out.println("You are in 45");
                break;
            default:
                System.out.println("Enter age again");
        }
    }
}