import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            int p = Math.max(p1,p2);
            int q = Math.max(q1,q2);
            if (p == q){
                System.out.println("TIE");
            }else if (p < q){
                System.out.println("P");
            }else {
                System.out.println("Q");
            }
        }
    }
}