## Student Class with Static Members in Java
Demonstrates **static variables and methods** to track total students and display individual student details.
class Student {
 static int totalStudents = 0;
 String name;
  Student(String name) {
        this.name = name;
        totalStudents++;
   }
    static void showTotalStudents() 
    {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    void showStudentDetails()
     {
        System.out.println("Student Name: " + name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
         Student.showTotalStudents();
          Student s1 = new Student("Kala");
        Student s2 = new Student("Kavi");
          Student.showTotalStudents(); 
          s1.showStudentDetails(); 
        s2.showStudentDetails(); 
}
}
