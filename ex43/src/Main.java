class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
public class Main {
    public static void main(String[] args) {
        CellPhone samsung = new CellPhone();
        samsung.ring();
        samsung.vibrate();
    }
}