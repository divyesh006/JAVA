import java.util.Scanner;

class Cylinder{
    private int radius,height;
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public double area(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of cylinder");
        Cylinder cyl = new Cylinder(sc.nextInt(),sc.nextInt());
        System.out.println("Area = "+cyl.area());
        System.out.println("Volume = "+cyl.volume());
    }
}