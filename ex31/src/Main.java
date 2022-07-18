import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter in array ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter array elements ");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Displaying array :");
        for (int elements : a){
            System.out.print(elements);
            System.out.print("  ");
        }
        System.out.println(" ");
        int b = Math.floorDiv(n,2);
        int temp;
        for (int i=0;i<b;i++){
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        System.out.println("Displaying array in revers order :");
        for (int i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print("  ");
        }
    }
}