import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int x = Math.abs(Math.subtractExact(x1,y1));
            int y = Math.abs( Math.subtractExact(x2,y2));
            System.out.println(Math.max(x,y));
        }
    }
}