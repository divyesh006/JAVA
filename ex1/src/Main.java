import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        float a=500;
        System.out.println("CBSE Percentage");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Subject 1 Marks");
        float num1= sc.nextFloat();
        System.out.println("Enter Subject 2 Marks");
        float num2 = sc.nextFloat();
        System.out.println("Enter Subject 3 Marks");
        float num3= sc.nextFloat();
        System.out.println("Enter Subject 4 Marks");
        float num4=sc.nextFloat();
        System.out.println("Enter Subject 5 Marks");
        float num5= sc.nextFloat();
        float sum=num1+num2+num3+num4+num5;
        System.out.println("Your total marks is " +sum);
        float p;
        p=sum/a*100;
        System.out.println("Your Percentage is " +p);
    }
}