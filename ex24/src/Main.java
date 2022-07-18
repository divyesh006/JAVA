import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to multiplication table ");
        int n = sc.nextInt();
        int mul;
        for (int i=10;i>0;i--){
            mul=i*n;
            System.out.println(n+" x "+i+" = "+mul);
        }
    }
}