import javax.swing.plaf.synth.SynthPopupMenuUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many student in classroom");
        int n = sc.nextInt();
        int [] marks = new int[n];
        int sum=0;
        float avg;
        System.out.println("Enter the marks of Physics Subject ");
        for (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for (int elements:marks){
            sum = sum+elements;
        }
        avg = (float) sum / n;
        System.out.println("Average Physics marks is "+avg);
    }
}