import java.util.Scanner;

public class Main {
    static int fibonacci(int f){
        if (f == 0){
            return 0;
        } else if (f == 1) {
            return 1;
        }else {
            return fibonacci(f-1) + fibonacci(f-2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want in fibonacci series :");
        int m = sc.nextInt();
        System.out.println("Fibonacci series : ");
        for (int i=0;i<m;i++){
            System.out.println(fibonacci(i));
        }

    }
}