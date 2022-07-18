import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter a length 2 dimensional array of [m][n]");
        m = sc.nextInt();
        n = sc.nextInt();
        int [][] flats = new int[m][n];
      //  System.out.println("Enter a elements " +flats[m][n]);
        System.out.println("enter a elements ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                flats[i][j]= sc.nextInt();
            }
        }
        System.out.println("print elements");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}