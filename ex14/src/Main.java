import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter a String with Double and Triple space :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Double Space index " +str.indexOf("  "));
        System.out.println("Triple Space index " +str.indexOf("   "));
    }
}