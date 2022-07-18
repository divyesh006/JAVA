public class Main {
    public static void main(String[] args)
    {
        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);
        System.out.println("Now Decrypting grade");
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}