class Base{
    int x;
    Base(){
        System.out.println("I am base class");
    }
    public void setX(int i){
        this.x = i;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
    int y;
    Derived(){
        System.out.println("I am Derived class");
    }
    public void setY(int i){
        this.y = i;
    }
    public int getY(){
        return y;
    }
}
public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
//        d.print();
        d.setX(6);
        System.out.println(d.getX());
//        d.print();
        d.setY(5);
        System.out.println(d.getY());
    }
}