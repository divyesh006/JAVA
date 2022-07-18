import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number ");
        int a = sc.nextInt();
        int b=1;
        do {
            System.out.println(b);
            b++;
        }while (b<=a);
    }
}