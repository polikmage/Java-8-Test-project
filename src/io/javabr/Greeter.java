package io.javabr;

public class Greeter {

    public void greet(Greeting greeting)
    {
        greeting.perform();
       // System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        FGreeting fGreeting = new FGreeting();
        greeter.greet(helloWorldGreeting);
        greeter.greet(fGreeting);
    }
}
