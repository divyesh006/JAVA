import java.util.Scanner;

public class Main {
    static int logic(int x,int y){
        int z;
        if (x<y){
            z=x+y;
        }
        else {
            z=x*y;
        }
        return z;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        System.out.println("Enter value of m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p;
//        Main obj = new Main();
        c = logic(a,b);
        p =logic(m,n);

        System.out.println("operation on a and b " +c);
        System.out.println("operation on m and n " +p);
    }
}