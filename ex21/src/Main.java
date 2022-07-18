import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        for(int i=0;i<=a;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Enter a number :");
        int b = sc.nextInt();
        for (int i=b;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Enter a numbver");
        int c = sc.nextInt();
        for (int i=c;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        System.out.println("Enter a numbver");
        int d = sc.nextInt();
        for (int i=d;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(1);
            }
            System.out.print("\n");
        }
    }
}