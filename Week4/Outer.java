## Java Static Nested Classes
Demonstrates **public and private static nested classes** in Java. Shows how static nested classes can be accessed directly from the outer class or via a static method.
class Outer
{
    public static class PublicNested
    {
        public void show()
        {
            System.out.println("Inside public static class");
        }
    }
    private static class Privatenested{
        public void show()
        {
            System.out.println("Inside private static class");
        }
    }
    static void access()
    {
        Privatenested obj=new Privatenested();
        obj.show();
    }
}

        public class Access {
            public static void main(String[] args) {
                Outer.PublicNested p1=new Outer.PublicNested();
                p1.show();
                Outer.access();
            }
    
}
