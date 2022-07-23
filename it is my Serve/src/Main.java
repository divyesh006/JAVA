import java.util.Scanner;
/*   Alice    bob
     (0)       2
     1         3

     (4)       6
     5         7

     (8)       10
     9         11

     () is a multiplication of 4 and there for their modulo is 0 and after that number the modulo of next
     number is 1 this is logic used in this problem
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int x = p+q;
            if(x % 4 == 0 || x % 4 == 1){
                System.out.println("ALICE");
            }else {
                System.out.println("BOB");
            }
        }
    }
}