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
                System.out.println("Name:N.D.Nitesh\nRoll NO:2024503529");
                Outer.PublicNested p1=new Outer.PublicNested();
                p1.show();
                Outer.access();
            }
    
}
