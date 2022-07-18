import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of V");
        float v = sc.nextFloat();
        System.out.println("Enter the value of U");
        float u = sc.nextFloat();
        System.out.println("Enter the value of a");
        float a = sc.nextFloat();
        System.out.println("Enter the value of s");
        float s = sc.nextFloat();
        float ans;
        ans= (v*v-u*u)/(2*a*s);
        System.out.println("Your ans is " +ans);
    }
}