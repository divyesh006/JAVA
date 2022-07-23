import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x > 3){
                int d = x/3;
                if (x % 3 ==0){
                    System.out.println((x*y)+(d*z)-z);
                }else {
                    System.out.println((x*y)+(d*z));
                }
            }else {
                System.out.println(x*y);
            }
        }
    }
}