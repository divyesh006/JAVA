import java.util.Scanner;

public class Main {
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    static void pattern1(int b){
        if(b>0){
            for (int i=0;i<b;i++){
                System.out.print("* ");
            }
            System.out.println(" ");
            pattern1(b-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        pattern(a);
        pattern1(a);
    }
}