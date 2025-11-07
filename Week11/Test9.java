## Functional Interface and Lambda Expression in Java  
Demonstrates the use of a **@FunctionalInterface** with a **lambda expression** for concise code.  
The `Greeting` interface defines a single abstract method, implemented using a lambda to print personalized greetings.  
Highlights **functional programming** features introduced in **Java 8**.  
#Java #LambdaExpression #FunctionalInterface #Java8 #OOP


@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

class Test9 {
    public static void main(String[] args) {
       
        Greeting g = (name) -> System.out.println("Hello, " + name + "!");
        g.sayHello("Nitesh");
    }
}
