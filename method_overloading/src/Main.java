import java.time.Year;

public class Main {
    static int change(int a){
        a = 6;
        return a;
    }
    static void change1(int b){
        b  = 6;
    }
    static void change2(int [] c){
        c[0] = 55;
    }
    static void joke(){
        System.out.println("I am joke");
    }
    public static void main(String[] args)
    {
        int x = 60;
        int y;
      joke();
      y = change(x);
        System.out.println("value of x is " +x);
        System.out.println("value of y is " + y);
        int m = 9;
        int [] n = {90 ,50,40,60,90};
        change1(m);
        change2(n);
        System.out.println("the value of m "+m);
        System.out.println("the value of index 0 " +n[0]);

    }
}