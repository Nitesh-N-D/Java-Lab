## Demo of Default Constructor in Java
Illustrates the use of a **default constructor** to initialize class members and display their values.
class DemoConstructor{
    int a;
    String text;
    void display()
    {
        System.out.println("a is:"+a);
        System.out.println("The text is:"+text);
    }
}

public class Demo {
    public static void main(String[] args)
    {

        DemoConstructor d1=new DemoConstructor();
        d1.display();

    }

}
