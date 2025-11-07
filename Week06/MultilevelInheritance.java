## Multilevel Inheritance in Java
Demonstrates **multilevel inheritance** where `LivingBeing` is the base class, `Animal` inherits from it, and `Cat` & `Dog` inherit from `Animal`. Shows **constructor chaining** and specialized methods like `Meow()` and `Bark()`.

class LivingBeing {

LivingBeing()

{

System.out.println("LivingBeing constructor called");

}

void Breath() {

System.out.println("They are breathing");

}

void Response()

{

System.out.println("They are responsing");

}


}

class Animal extends LivingBeing

{

Animal()

{

System.out.println("Animal constructor called");

}

void Walk()

{

System.out.println("Animals are walking");

}

void NoOfLegs()

{

System.out.println("Animals have 4 legs");

}

}

class Cat extends Animal{

Cat()

{

System.out.println("Cat Constructor called");

}

void Meow()

{

System.out.println("Sounds seems Meow Meow");

}

}

class Dog extends Animal{

Dog()

{

System.out.println("Dog constructor called");

}

void Bark()

{

System.out.println("Dog is Barking Woof Woof");

}

}

public class MultilevelInheritance {

public static void main(String[] args) {

Animal a=new Animal();

a.Breath();

a.Response();

a.Walk();

a.NoOfLegs();

Cat c=new Cat();

c.Meow();

Dog d2=new Dog();

d2.Bark();



}

}
