import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int count = 0;
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1){
                    count++;
                } else if (a[i] == -1) {
                    count1++;
                }
            }
            if (n % 2 != 0){
                System.out.println(-1);
            }else {
                int number = Math.abs(count1 - count);
                System.out.println(number/2);
            }
        }
    }
}