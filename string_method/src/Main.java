import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter Anything:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
//        String name = "Divyesh";
        String a ="    patel divyesh    ";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(a);
        System.out.println(a.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5)); //end is not include
        System.out.println(name.replace('d','b'));
        System.out.println(name.replace("yesh","u"));
        System.out.println("strat with " +name.startsWith("di"));
        System.out.println("Ends with" +name.endsWith("sh"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("s"));
        System.out.println(name.lastIndexOf("d"));
        System.out.println(name.equals("divyesh"));
        System.out.println(name.equalsIgnoreCase("DiVyEsh"));
    }
}