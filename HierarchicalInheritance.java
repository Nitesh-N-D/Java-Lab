## Hierarchical Inheritance in Java
Demonstrates **hierarchical inheritance** with a LivingBeing base class and derived classes for LandAnimal, WaterAnimal, Dog, and Cat, showcasing constructors and specific behaviors.

class LivingBeing{

LivingBeing(String name)

{

System.out.println("The name of the living being is"+name);

System.out.println("LivingBeing constructor called");

}

void breathe()

{

System.out.println("It is breathing");

}

void response()

{

System.out.println("It is responsing");

}

}

class LandAnimal extends LivingBeing{


LandAnimal(String name) {

super(name);

System.out.println("LandAnimal Constructor called");

}

void walk()

{

System.out.println("It is walking");

}

void NoOfLegs()

{

System.out.println("It has 4 legs");

}

}


class WaterAnimal extends LivingBeing

{

WaterAnimal(String name)

{

super(name);

System.out.println("WaterAnimal Constructor called");

}

void swim()

{

System.out.println("It is swimming");

}

void waterType()

{

System.out.println("It's looks like fresh water");

}

}

class Dog extends LandAnimal

{

Dog(String name)

{

super(name);

System.out.println("Dog Constructor called");

}

void bark()

{

System.out.println("It is barking");

}

}

class Cat extends LandAnimal

{

Cat(String name)

{

super(name);

System.out.println("Cat constructor called");

}

void meow()

{

System.out.println("It sound seems like meow meow");

}

}


public class HierarchicalInheritance {

public static void main(String[] args) {

Dog d=new Dog(" Tommy");

d.breathe();

d.response();

d.walk();

d.NoOfLegs();

d.bark();

Cat c=new Cat(" Jerry");

c.breathe();

c.response();

c.walk();

c.NoOfLegs();

c.meow();

}

}
