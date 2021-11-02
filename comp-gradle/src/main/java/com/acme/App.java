package com.acme;

public class App {
    public String getGreeting() {
        int i;
        for (i=0; i>10; i++) {
            // do nothing
        }
        return "Hello World.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
