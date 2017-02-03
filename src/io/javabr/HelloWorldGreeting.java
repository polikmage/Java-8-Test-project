package io.javabr;

/**
 * Created by mapo0104 on 3.2.2017.
 */
public class HelloWorldGreeting implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}
