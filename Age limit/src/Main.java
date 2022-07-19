import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            if (X <= A && Y > A){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            T--;
        }
    }
}