## Athlete Simulation in Java  
Program to simulate **athletes with energy and skill power**.  
The program:  
- Allows athletes to **compete**, **rest**, and **train**, affecting their stats  
- Tracks each athlete's **energy, skill power, max energy, and active status**  
- Demonstrates **object interaction** and **status updates**  
- Maintains a **static counter** to track the total number of athletes created  
 
import java.util.Scanner;
import java.util.Random;
 class Athlete {
    String name;
    int energy;
    int skillPower;
    int maxEnergy;
    boolean isActive;
    static int totalAthletes=0;
    Athlete()
    {
        this.name="Player";
        this.energy=100;
        this.skillPower=10;
        this.maxEnergy=100;
        this.isActive=true;
        totalAthletes++;
    }
    public Athlete(String name,int energy,int skillPower,int maxEnergy)
    {
        this.name=name;
        this.energy=energy;
        this.skillPower=skillPower;
        this.maxEnergy=maxEnergy;
        this.isActive=true;
        totalAthletes++;
    }
    void compete(Athlete opponent) {
        if(this.isActive&&opponent.isActive)
        {
            System.out.println(this.name +" is competing against "+opponent.name);
            opponent.energy-=this.skillPower;
            if(opponent.energy<=0)
            {
                opponent.energy=0;
                opponent.isActive=false;
                System.out.println(opponent.name+" is out");
            }
            else{
                System.out.println(opponent.name+" energy is "+opponent.energy);
            }
        }
        else
        {
            System.out.println("One is inactive");
        }
        }
        void rest(int amount)
        {
            if(!isActive)
            {
                System.out.println(this.name+" cannot rest\nThey are incative");
                return;
            }
            this.energy+=amount;
            if(this.energy>this.maxEnergy)
            {
                this.energy=this.maxEnergy;

            }
            System.out.println(this.name+" is rested and the enegy is "+this.energy);
                }
                void train()
                {
                    if(!isActive)
                    {
                        System.out.println(this.name+" cannot train\n Inactive");
                        return;
                    }
                    Random random=new Random();
                    int gain=random.nextInt(10)+1;
                    this.skillPower+=gain;
                    System.out.println(this.name+" trained and gained "+gain+" points Total power:"+this.skillPower);
                }
                void display()
                {
                    System.out.println("Name:" +this.name);
                    System.out.println("Energy:"+this.energy);
                    System.out.println("SkillPower:"+this.skillPower);
                    System.out.println("Max Energy:"+this.maxEnergy);
                    System.out.println("Active:"+(this.isActive ? "Yes" : "No"));
                }
            }
            public class Main{
                public static void main(String[] args) {
                    Athlete a1=new Athlete("Sachin",80,11,100);
                    Athlete a2=new Athlete();
                    Athlete a3=new Athlete("Leo",90,14,100);
                    a1.display();
                    a2.display();
                    a3.display();
                    a2.compete(a1);
                    a3.compete(a1);
                    a3.rest(15);
                    a1.rest(20);
                    a1.train();
                    a2.train();
                    a3.train();
                    a1.display();
                    a2.display();
                    a3.display();
                    System.out.println("\nTotal athletes created: "+Athlete.totalAthletes);
                }
            }
