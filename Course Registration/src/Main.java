import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if ((m-k) >= n){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}