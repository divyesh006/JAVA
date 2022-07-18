import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to summation of that multiplication tablle ");
        int n = sc.nextInt();
        int mul,sum=0;
        for (int i=1;i<=10;i++){
            mul=i*n;
            sum=sum+mul;
            System.out.println(n+" x "+i+" = "+mul);
        }
        System.out.println("Sum of Whole Table "+sum);
    }
}