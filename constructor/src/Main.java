class Employee{
     int id;
     String name;
    public Employee(){
        id = 666;
        name = "Divyesh";
    }
    public Employee(String n, int i){
        this.name = n;
        this.id = i;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("divyesh",6);
        System.out.println(emp.id);
        System.out.println(emp.name);
        Employee em = new Employee();
        System.out.println(em.id);
        System.out.println(em.name);
    }
}