import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        byte p,c,m;
        System.out.println("Enter Your marks in phy");
        p= sc.nextByte();
        System.out.println("Enter Your marks in chem");
        c= sc.nextByte();
        System.out.println("Enter Your marks in maths");
        m=sc.nextByte();
        float avg=(p+c+m)/3.0f;
        if (p>=33 && c>=33 && m>=33 && avg>=40){
            System.out.println("You are pass!!");
        }
        else {
            System.out.println("You are fail!!");
        }

    }
}