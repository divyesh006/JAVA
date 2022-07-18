import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number until you want odd number");
        int a = sc.nextInt();
        for (int i=1;i<=a;i++){
            System.out.println(i);
            i++;
        }
        System.out.println("Enter a number to first n odd number");
        int b = sc.nextInt();
        for (int i=0;i<b;i++){
            System.out.println(2*i+1);
        }
        System.out.println("Enter a number to print first n natural number in reverse order: ");
        int c =sc.nextInt();
        for (int i=c;i!=0;i--){
            System.out.println(i);
        }
    }
}