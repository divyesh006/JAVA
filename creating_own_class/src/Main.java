class  Employee{
    int id;
    String name;
    int salary;
    public void printDetail(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
        }
public class Main {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee divyesh = new Employee();
        Employee jethalal = new Employee();
        divyesh.id = 6;
        divyesh.name = "divyesh";
        divyesh.salary = 12;
        jethalal.id = 101;
        jethalal.salary = 12;
        jethalal.name = "jethalal gada";
        divyesh.printDetail();
        jethalal.printDetail();
        int salary = divyesh.getSalary();
        System.out.println(salary);
//        System.out.println(divyesh.id);
//        System.out.println(divyesh.name);
    }
}