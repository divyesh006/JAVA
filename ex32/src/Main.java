import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want to enter in array :");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter Array elements :");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Displaying array :");
        for (int elements:a){
            System.out.print(elements);
            System.out.print("  ");
        }
        System.out.println(" ");
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum element of array is "+max);
    }
}
