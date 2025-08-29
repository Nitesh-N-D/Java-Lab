class OuterClass{
    public class PublicInner
    {
        public void display()
        {
            System.out.println("Inside public inner class");
        }
    }
        private class PrivateInner
        {
        public void display()
        {
            System.out.println("Inside private inner class");
        }
    }
    void access()
    {
        PrivateInner p1=new PrivateInner();
        p1.display();
    }
}
    public class MainAccess {
        public static void main(String[] args) {
            System.out.println("Name:N.D.Nitesh\nRoll NO:2024503529");
            OuterClass o2=new OuterClass();
            OuterClass.PublicInner p2=o2.new PublicInner();
            p2.display();
            o2.access();
        }
    }
