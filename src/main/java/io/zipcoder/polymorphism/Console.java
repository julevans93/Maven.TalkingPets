package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {

    public static void print(String output){
        Console.print(output);
    }

    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
