import java.util.Scanner;

public class Main {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print pattern :");
        int a = sc.nextInt();
        pattern(a);
    }
}