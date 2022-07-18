import java.util.Random;
import java.util.Scanner;

class Game{
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int random;
    int input;
    int number = 0;
//    boolean correct = false;
    public Game(){
         random = rand.nextInt(100)+1;
    }
    public void getInput(){
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        if (a<=100 && a>0){
            this.input = a;
        }else {
            this.input = 0;
            System.out.println("\t\t\tEnter a valid number!!!");
        }
    }
    public boolean CorrectNumber(){
//        System.out.println(random);
//        System.out.println(input);
        if (random<input && input<100){
            System.out.println("\tYou Guess a big Number");
            number++;
            return true;
        } else if (random>input && input>0) {
            System.out.println("\tYou Guess a small Number");
            number++;
            return true;
        }
        else if (random == input){
            System.out.println("\tYou Guess a Correct NUmber");
            number++;
            System.out.println("\t\t\t\t\tYour Score is "+number);
            return false;
        }
        else {
            System.out.println("Enter number again...");
            return true;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("\t\t\t\t\tGUESS THE NUMBER GAME\n");
        System.out.println("Numbers are between 1 and 100");
        boolean b = true;
        while(b){
            game.getInput();
            b = game.CorrectNumber();
        }
    }
}