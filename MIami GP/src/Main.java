import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x*1.07 >= y){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}