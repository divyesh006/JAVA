import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int alice = sc.nextInt();
            int bob = sc.nextInt();
            int charlie = sc.nextInt();
            if(alice > bob && alice > charlie){
                System.out.println("Alice");
            } else if (bob > alice && bob > charlie) {
                System.out.println("Bob");
            }else {
                System.out.println("Charlie");
            }
        }
    }
}