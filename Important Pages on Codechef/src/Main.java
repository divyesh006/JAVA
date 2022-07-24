import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0 || a == 0 && b == 1 ){
                System.out.println("https://www.codechef.com/practice");
            }
            else if (a == 1 && b == 0){
                System.out.println("https://www.codechef.com/contests");
            }else {
                System.out.println("https://discuss.codechef.com");
            }
    }
}