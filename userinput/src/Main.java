import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a= sc.nextInt();
        System.out.println("Enter number 2");
        int b= sc.nextInt();
        int sum =a+b;
        System.out.println("The Sum is ");
        System.out.println(sum);
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);

    }
}
