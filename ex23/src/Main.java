import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print a multiplication table:");
        int n = sc.nextInt();
        int mul;
        for (int i =1;i<=10;i++){
         mul=i*n;
         System.out.println(n+" * "+i+" = "+mul);
        }
    }
}