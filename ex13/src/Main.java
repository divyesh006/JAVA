import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Your String is: Dear <|name|>,Thanks a lot!");
        String name1 ="Dear <|name|>,Thanks a lot!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name to put in the string");
        String name = sc.next();
        name1 = name1.replace("<|name|>",name);
        System.out.println(name1);
    }
}