import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 && y == 0){
                System.out.println("No");
            }else if (x == y){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}