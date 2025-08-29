import java.util.Scanner;
class Product
{
    String name;
    double price;
    Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    void discount(double percentage)
    {
        double discount=(this.price*percentage)/100;
        this.price=this.price-discount;
        this.display();
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Final price:"+price);

    }
}
    public class NamingConflicts {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter product name:");
            String name=sc.nextLine();
            System.out.println("Enter the price:");
            double price=sc.nextDouble();
            System.out.println("Enter the discount percentage:");
            double discount=sc.nextDouble();
            Product p=new Product(name,price);
            p.discount(discount);
        }
}
