import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of both matrix (for summation both are same)");
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        int [][] mat1 = new int[m][n];
        int [][] mat2 = new int[m][n];
        int [][] sum = new int [m][n];
        System.out.println("Enter the Elements of matrix of 1 ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of matrix of 2 ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying of matrix 1");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(mat1[i][j]);
                System.out.print("  ");
            }
            System.out.println("  ");
        }
        System.out.println("Displaying of matrix 2");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(mat2[i][j]);
                System.out.print("  ");
            }
            System.out.println("  ");
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Summation of both matrix ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(sum[i][j]);
                System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}