import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        double tax=0;
        float income;
        System.out.println("\t\tIncome Tax Calculator");
        System.out.println("Enter your income (L):");
        income = sc.nextFloat();
        if (income<2.5)
            System.out.println("No Tax!!");
        if(income>2.5f && income <=5f) {
            tax = (tax + 0.05f * (income - 2.5f))*100000;
            System.out.println("You have to pay " + tax + " Rupee");
        } else if (income>5.0f && income<=10.0f) {
            tax =tax + (0.05f * 2.5f);
            tax= (tax + 0.2f *(income-5f))*100000;
            System.out.println("You have to pay " +tax+ " Rupee");
        }
        else if (income>10.0f){
            tax =tax + (0.05f * 2.5f);
            tax =tax + (0.2f * 5.0f) ;
            tax =(tax + 0.3*(income-10.0f))*100000;
            System.out.println("You have to pay " +tax+ " Rupee");
        }

    }
}