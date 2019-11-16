package io.zipcoder.polymorphism;

public class Dog extends Pet {

    private String name;

    public Dog(String speak, String name) {
        super(speak, name);
    }

    public String speak() {
        return "bark!";
    }
}
