class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee divyesh = new Employee();
        divyesh.setName("Patel divyesh Nareshbhai");
        divyesh.salary = 144;
        System.out.println(divyesh.getSalary());
        System.out.println(divyesh.getName());
    }
}