import java.util.Scanner;

public class Main {
    static int factorial(int n){
        int ans;
        if (n == 0 || n == 1 ){
            ans = 1;
        }else {
            ans = n*factorial(n-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt();
            int fact = factorial(a);
            System.out.println(fact);
        }
    }
}