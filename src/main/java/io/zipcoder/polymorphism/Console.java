package io.zipcoder.polymorphism;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {

    public Console() {
    }

    public static void print (String output){
        System.out.println(output);
    }

    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        String userInput = scanner.next();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

}
