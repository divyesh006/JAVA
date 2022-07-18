import java.util.Scanner;

public class Main {
    static int fibonacci(int n){
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print nth term of fibonacci series :");
        int a = sc.nextInt();
        int b = fibonacci(a);
        System.out.println("number is "+b);
    }
}