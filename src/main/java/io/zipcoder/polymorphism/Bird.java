package io.zipcoder.polymorphism;

public class Bird extends Pet {

    public Bird(String speak, String name) {

        super(speak, name);
    }

    public String speak(){

        return "tweet!";
    }

}
