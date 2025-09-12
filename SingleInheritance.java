## Single Inheritance in Java
Demonstrates **single inheritance** with a LivingBeing base class and an Animal derived class, showing constructors and specific behaviors.

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

public class SingleInheritance {

public static void main(String[] args) {

Animal a=new Animal();

a.Breath();

a.Response();

a.Walk();

a.NoOfLegs();

}

}
