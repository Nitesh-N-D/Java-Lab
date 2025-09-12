## Book Class Constructor Chaining in Java
Demonstrates **constructor chaining** with default, two-parameter, and three-parameter constructors, and displays book details.
import java.util.Scanner;
class Book
{
    String title;
    String author;
    double price;
    Book()
    {
        this("Unknown title","Unknown author");
        System.out.println("Default constructor called");
    }
    Book(String title,String author)
    {
        this(title,author,0.0);
        System.out.println("With 2 parameters");
    }
    Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        System.out.println("3 parameters");
    }
    void display()
    {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
}
    public class Chain {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Book b1=new Book();
            b1.display();
            Book b2=new Book("Wings of fire","APJ");
            b2.display();
            Book b3=new Book("Java","Robert",550);
            b3.display();
            sc.close();
        }
    
}
