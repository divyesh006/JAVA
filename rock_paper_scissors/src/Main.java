import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Random rand =new Random();
        Scanner sc =new Scanner(System.in);
        System.out.println("\n\n\t\t\t\t\tRock Paper And Scissor Game:");
        System.out.println("Here,\n\t1 for Scissor \n\t2 for Paper \n\t3 for Rock");
        System.out.print("Enter Your Choice :");
        int a = sc.nextInt();
        int b = rand.nextInt(3) + 1;
        if(a<1 || a>3){
            System.out.println("\t\t\t\t\tPlease Select a valid Choice!!!!");
        }else {
            if (b == 1) {
                System.out.println("Computer choose Scissor");
            } else if (b == 2) {
                System.out.println("Computer choose Paper");
            } else {
                System.out.println("Computer choose Rock");
            }
        }
        if (a==b){
            System.out.println("\t\t\t\t\tIt's Tie!!!");
        } else if (a==1 && b==2){
            System.out.println("\t\t\t\t\tYou Win!!!");
        } else if (a==1 && b==3){
            System.out.println("\t\t\t\t\tComputer Wins!!!");
        } else if (a==2 && b==1) {
            System.out.println("\t\t\t\t\tComputer Wins!!!");
        } else if (a==2 && b==3) {
            System.out.println("\t\t\t\t\tYou Win!!!");
        } else if (a==3 && b==1) {
            System.out.println("\t\t\t\t\tYou Win!!!");
        } else if (a==3 && b==2) {
            System.out.println("\t\t\t\t\tComputer Wins!!!");
        }
    }
}
