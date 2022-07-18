import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter in array :");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter elements :");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Displaying elements :");
        for (int elements:a){
            System.out.print(elements);
            System.out.print("  ");
        }
        System.out.println(" ");
        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println("The minimum number in this array : "+min );
    }
}