import javax.crypto.Cipher;
import java.util.Scanner;

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int l , b;
    public int area(){
        return l*b;
    }
    public int perimeter() {
        return 2*(l+b);
    }
}
class Circle{
    int r;
    public double area(){
        return 4*3.14*r*r;
    }
    public double perimeter(){
        return 4*3.14*r;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        System.out.println("Enter a length of Square");
        sq.side = sc.nextInt();
        System.out.println("The area of a Square is "+sq.area());
        System.out.println("The perimeter of a Square is "+sq.perimeter());
        Rectangle rt = new Rectangle();
        System.out.println("Enter the length and breadth of a rectangle");
        rt.l = sc.nextInt();
        rt.b = sc.nextInt();
        System.out.println("The area of a Rectangle is "+rt.area());
        System.out.println("The perimeter of a Rectangle is "+rt.perimeter());
        Circle cr = new Circle();
        System.out.println("Enter a Radius of a Circle ");
        cr.r = sc.nextInt();
        System.out.println("The area of a Circle is "+cr.area());
        System.out.println("The perimeter of Circle is "+cr.perimeter());
    }
}