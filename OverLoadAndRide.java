class Animal{
    void move() {
        System.out.println("Animal is Moving");
    }

    void move(String direction) {
        System.out.println("Animal is moving in the " + direction);
    }

    void move(int distance) {
        System.out.println("Animal is at the distance: " + distance+"m");

    }

    void move(String direction, int distance) {
        System.out.println("Animal is moving at the " + direction + " and " + "at a distance of " + distance+"m");
    }
}
class Dog extends Animal {
    void move() {
        System.out.println("Dog is Walking");
    }

    void move(String direction) {
        System.out.println("Dog is walking in the " + direction);
    }

    void move(int distance) {
        System.out.println("Dog is at the distance: " + distance+"m");

    }

    void move(String direction, int distance) {
        System.out.println("Animal is walking at the " + direction + " and " + "at a distance of " + distance+" m");
    }
}
class Cat extends Animal
{
    void move() {
        System.out.println("Cat is Walking");
    }

    void move(String direction) {
        System.out.println("Cat is walking in the " + direction);
    }

    void move(int distance) {
        System.out.println("Cat is at the distance: " + distance+" m");

    }

    void move(String direction, int distance) {
        System.out.println("Cat is walking at the " + direction + " and " + "at a distance of " + distance+" m");
    }
}
class Bird extends Animal
{
    void move() {
        System.out.println("Bird is Flying");
    }

    void move(String direction) {
        System.out.println("Bird is flying in the " + direction);
    }

    void move(int distance) {
        System.out.println("Bird is at the distance: " + distance+" m");

    }

    void move(String direction, int distance) {
        System.out.println("Bird is flying at the " + direction + " and " + "at a distance of " + distance);
    }
}
public class OverLoadAndRide {
    public static void main(String[] args) {
        System.out.println("Name:N.D.Nitesh\nRoll NO:2024503529");
        Animal a=new Animal();
        Dog d=new Dog();
        Cat c=new Cat();
        Bird b=new Bird();
        a.move();
        a.move("North");
        a.move(45);
        a.move("North",68);
        Animal[] animals={d,c,b};
        for(Animal a1:animals  )
        {
            a1.move();
            a1.move("West");
            a1.move(65);
            a1.move("West",65);

        }

    }
}
