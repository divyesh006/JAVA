import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean Inarray=false;
        System.out.println("How many Elements You want enter in array ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter array elements ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter a number you want to find in array");
        int number = sc.nextInt();
        for (int i=0;i<n;i++){
            if (a[i]==number){
                Inarray=true;
                System.out.println("Number found at index of "+i);
                break;
            }
        }
        if(Inarray){
            System.out.println("");
        }else {
            System.out.println("Oops NUmber not found");
        }
    }
}