import java.util.Scanner;
class Team
{
      public static void main(String[] args) 
       {
 	            int runs;
 		    byte fouls;
                    boolean winstatus;
	            Scanner sc=new Scanner(System.in);
                    System.out.println("Name:N.D.Nitesh \nRoll.No:2024503529");
                    System.out.println("Enter team runs:");
                    runs=sc.nextInt();
                    System.out.println("Enter the fouls:");
                    fouls=sc.nextByte();
                    winstatus=(runs>=50)&&(fouls<=5);
                    System.out.println("Team Runs:"+runs);
                    System.out.println("Team fouls:"+fouls);
                    System.out.println("Win Status:"+winstatus);
       }
}
