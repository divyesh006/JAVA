import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i=0, sum = 0;
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        while (i<n){
            sum=sum+(2*i);
            i++;
        }
        System.out.println("Sum of first n even numbers " +sum);
    }
}