import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter A Sentence:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.replace(" ","__");
        System.out.println("Convert String  " +text);
    }
}