package io.zipcoder.polymorphism;

public class Pet {
    private String speak;
    private String name;


    public Pet(String name, String speak){
        this.speak = speak;
        this.name = name;
    }
    public String getSpeak() {

        return speak;
    }

    public void setSpeak(String speak) {

        this.speak = speak;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
