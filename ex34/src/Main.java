import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter in array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Displaying array :");
        for (int elements:a){
            System.out.print(elements);
            System.out.print("  ");
        }
        System.out.println(" ");
        boolean sorted = true;
        for (int i=0;i<n-1;i++){
            if (a[i]>a[i+1]){
                sorted = false;
                break;
            }
        }
        if (sorted){
            System.out.println("Array is Sorted ");
        }
        else {
            System.out.println("Array is not Sorted ");
        }
    }
}