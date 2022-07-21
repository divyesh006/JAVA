import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] a = new int[t];
        int count = 0;
        for(int i = 0; i < t; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < t; i++){
            if(a[i] % 2 == 0){
                count++;
            }else {
                count--;
            }
        }
        if (count <= 0){
            System.out.println("NOT READY");
        }else {
            System.out.println("READY FOR BATTLE");
        }
    }
}