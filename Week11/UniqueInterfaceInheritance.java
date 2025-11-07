## Interface Inheritance in Java  
Demonstrates **interface inheritance** where one interface extends another (`Companion` extends `Creature`).  
Implements both interfaces in `WolfDog` to show **multiple behavior definitions**.  
Highlights **polymorphism** using interface references (`Companion` and `Creature`).  
#Java #InterfaceInheritance #Polymorphism #Abstraction #OOP


interface Creature {
    void eat();
}
interface Companion extends Creature {
    void play();
}

class WolfDog implements Companion {
    public void eat() {
        System.out.println("WolfDog eats meat");
    }

    public void play() {
        System.out.println("WolfDog loves to play outside");
    }
}

public class UniqueInterfaceInheritance {
    public static void main(String[] args) {
    
        WolfDog myPet = new WolfDog();

      
        myPet.eat();
        myPet.play();

       
        Companion companionRef = myPet;
        companionRef.play();

        Creature creatureRef = myPet;
        creatureRef.eat();
    }
}
