import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("CGPA calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        float a= sc.nextFloat();
        System.out.println("Enter subject 2 marks");
        float b= sc.nextFloat();
        System.out.println("Enter subject 3 marks");
        float c=sc.nextFloat();
        float cgpa =(a+b+c)/30;
        System.out.println("Your CGPA is " +cgpa);
    }
}