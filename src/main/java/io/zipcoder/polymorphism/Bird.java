package io.zipcoder.polymorphism;

public class Bird extends Pet {
    private String name;

    public Bird(String speak, String name) {
        super(speak, name);
    }

    public String speak(){
        return "tweet!";
    }

    public void setName(){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
