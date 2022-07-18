import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] marks = {0,1,2,3,4,5};
        float [] number = {0,1.1f,2,3,4,5};
        String [] name = { "divyesh ","divyesh"};
        System.out.println(marks.length);
        System.out.println(number[3]);
        System.out.println("how many elements you want to enter in array");
        int n = sc.nextInt();
        System.out.println("Enter a Array elements ");
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Elements in revers order ");
        for (int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
        System.out.println("print using for each loop ");
        for (int element: a){
            System.out.println(element);
        }
    }
}