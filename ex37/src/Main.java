import java.util.Scanner;

public class Main {
    static int sum(int n){
        if(n>0){
            return n + sum(n-1);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate summation of first n number :");
        int a = sc.nextInt();
        int reslt;
        reslt = sum(a);
        System.out.println("Summation of First n number :"+reslt);

    }
}