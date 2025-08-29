import java.util.Scanner;
class Employee {
    int no;
    int id;
    String name;
    Employee(String name)
    {
        this.name=name;
        this.id=0;
        this.no=no;
    }
    Employee(String name,int id,int no)
    {
        this.name=name;
        this.id=id;
        this.no=no;
    }

    void display() {
        System.out.println("Employee no:" + no);
        System.out.println("Employee id:" + id);
        System.out.println("Employee name:" + name);
    }
}

    public class ParameterizedConstructor {
        public static void main(String[] args) {
            Employee p1 = new Employee("Ravanan");
            p1.display();
            Employee p2 = new Employee("Maharaj",123,456);
            p2.display();
            Employee p3 = new Employee("Aditya",457,12);
            p3.display();
        }
    }
