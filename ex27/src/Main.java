import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many Elements you want to enter in array ");
        n = sc.nextInt();
        float [] number = new float[n];
        float sum=0;
        System.out.println("Enter Elements ");
        for (int i=0;i<n;i++){
            number[i] = sc.nextFloat();
        }
        System.out.println("Displaying Elements ");
        for (int i=0;i<n;i++){
            System.out.println(number[i]);
        }
        for (int i=0;i<n;i++){
            sum=sum+number[i];
        }
        System.out.println("Summation of Array's Elements "+sum);
    }
}