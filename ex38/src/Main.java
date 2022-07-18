import java.util.Scanner;

public class Main {
    static void pattern(int n){
        for (int i=n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print a pattern :");
        int a = sc.nextInt();
        pattern(a);

    }
}