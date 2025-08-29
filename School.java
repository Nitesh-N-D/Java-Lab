class School{
    static String sname;
    String stuname;
    static{
        sname="\nGreen Valley School";
    }
    School(String stuname)
    {
        this.stuname=stuname;
    }
    void display()
    {
        System.out.println("Student:\n"+stuname+"\nSchool:"+sname);
    }
    static void schoolInfo()
    {
        System.out.println("School name:"+sname);
        School temp=new School("Temporary:");
        temp.display();
    }
}
    public class SchoolInfo {
        public static void main(String[] args) {
            System.out.println("Name:N.D.Nitesh\nRoll NO:2024503529");
            School.schoolInfo();
            School s1=new School("Kala");
            s1.display();
            
        }
    
}
