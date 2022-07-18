public class Main {
    static int sum(int ...arr){
        int result = 0;
        for (int a: arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("the sum of 6 and 7 is "+sum(6,7));
        System.out.println("the sum of 3 and 4 is "+sum(3,4));
        System.out.println("the sum of 1, 2 and 3 is "+sum(1,2,3));
        System.out.println("the sum of 2, 3, 4 and 5 is "+sum(2,3,4,5));
    }
}