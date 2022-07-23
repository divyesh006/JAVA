import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int f1;
            int f2;
            if (x % 10 == 0){
                f1 = (x/10);
            }else {
                f1 = (x/10) + 1;
            }
            if (y % 10 == 0){
                f2 = (y/10);
            }else {
                f2 = (y/10) + 1;
            }
            System.out.println(Math.abs(f1-f2));
        }
    }
}