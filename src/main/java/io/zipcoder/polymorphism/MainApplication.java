package io.zipcoder.polymorphism;

import sun.applet.Main;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    Integer numOfPets;
    String petType;
    String petName;
    ArrayList<Pet> pets = new ArrayList<Pet>();
    Cat cat = new Cat(null, null);
    Dog dog = new Dog(null, null);
    Bird bird = new Bird(null, null);
    Pet pet = new Pet(null, null);

    public static void main(String[] args) {
        MainApplication newMain = new MainApplication();
        newMain.run();
    }

    public void run() {
        numberOfPets();
        typeOfPet();
        nameOfPet();
    }

    public void numberOfPets() {
        numOfPets = Console.getIntegerInput("How many pets do you have?");
    }

    public void typeOfPet() {
        this.petType = Console.getStringInput("What type of pet do you have?\nDog, cat, or bird");
        if (this.petType == "dog") {
            this.petType = dog.speak();
        }
         if (this.petType == "cat") {
             petType = cat.speak();
         }
        if (this.petType == "bird"){
            this.petType = bird.speak();
        }
    }

    public void nameOfPet() {
        for (int i = 0; i < numOfPets; i++) {
            petName = Console.getStringInput("What is your pet's name?");
            pets.add(i, new Pet(petName, petType));
            Console.print("" + petName + " " + this.petType);
        }
    }
}






