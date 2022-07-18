class Employee{
   private int id;
   private String name;
   public void setName(String n){
       name = n;
   }
   public String getName(){
       return name;
   }
   public void setId(int i){
       id = i;
   }
   public int getId(){
       return id;
   }
}
public class Main {
    public static void main(String[] args) {
        Employee divyesh = new Employee();
        divyesh.setId(6);
        divyesh.setName("Divyesh");
        System.out.println("Name is "+divyesh.getName());
        System.out.println("id is "+divyesh.getId());
    }
}