@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using Lambda Expression
        Greeting greeting = name -> System.out.println("Hello, " + name);

        greeting.sayHello("Alice");
        greeting.sayHello("Bob");
    }
}
