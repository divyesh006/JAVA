class Tommy{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}
public class Main {
    public static void main(String[] args) {
        Tommy t = new Tommy();
        t.hit();
        t.run();
        t.fire();
    }
}