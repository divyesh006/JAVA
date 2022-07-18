import java.util.Scanner;
class Cylinder{
   private int radius,height;
        public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
       this.height = height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double area(){
        return 2*Math.PI*radius*(height+radius);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cyl = new Cylinder();
        System.out.println("\t\t\t\tCylinder Calculator");
        System.out.print("Enter Radius of Cylinder ");
        cyl.setRadius(sc.nextInt());
        System.out.print("Enter Height of Cylinder ");
        cyl.setHeight(sc.nextInt());
        System.out.println("Radius :"+cyl.getRadius());
        System.out.println("Height :"+cyl.getHeight());
        System.out.println("Surface Area :"+cyl.area());
        System.out.println("Volume :"+cyl.volume());
    }
}