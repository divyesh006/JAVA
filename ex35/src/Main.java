import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;

public class Main {
    static void multiplication(int a){
        int b;
        for (int i=1;i<=10;i++){
            b = a*i;
            System.out.println(a+" x "+i+" = "+b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to multiplication table");
        int n = sc.nextInt();
        multiplication(n);
    }
}