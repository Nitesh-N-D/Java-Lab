## Default and Static Methods in Java Interface  
Demonstrates the use of **default** and **static methods** in Java interfaces.  
The `Messenger` interface defines a default encryption method and a static logging method.  
The `WhatsApp` class implements the interface and provides a custom message-sending behavior.  
Illustrates how **interfaces can have concrete methods** to enhance reusability and flexibility.  
#Java #Interface #DefaultMethod #StaticMethod #OOP

interface Messenger {
    void sendMessage(String msg);
    default void encryptMessage() {
        System.out.println("Default encryption used");
    }
    static void logMessage() {
        System.out.println("Message logged");
    }
}

class WhatsApp implements Messenger {
    public void sendMessage(String msg) {
        System.out.println("Sending: " + msg);
    }
}

class Test5 {
    public static void main(String[] args) {
        WhatsApp w = new WhatsApp();
        w.sendMessage("Hello");
        w.encryptMessage();
        Messenger.logMessage();
    }
}
