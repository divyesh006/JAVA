import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Program to Convert Kilometers to Miles");
        System.out.println("Enter Kilometer :");
        Scanner sc =new Scanner(System.in);
        float a= sc.nextFloat();
        double m=a/1.609;
        System.out.println(a+ " Km into Miles is "+m );
    }
}