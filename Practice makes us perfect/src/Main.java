import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int p4 = sc.nextInt();
        int count = 0;
        if (p1 >= 10)
            count++;
        if (p2 >= 10)
            count++;
        if(p3 >= 10)
            count++;
        if (p4 >= 10)
            count++;
        System.out.println(count);
    }
}