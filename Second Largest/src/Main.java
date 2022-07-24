import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > b && a > c){
                a = 0;
            }else if (b > a && b > c){
                b = 0;
            }else {
                c = 0;
            }
            if (a > b && a > c){
                System.out.println(a);
            }else if (b > a && b > c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }
}