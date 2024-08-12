package org.javaclaseses;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String[] names = {"maths", "english", "Physics", "Chemistry"};
        System.out.println(names);
        System.out.println(names[0]);

        String[] text;
        text = new String[6];
        System.out.println(text[0]);

        //for each loop

        for (String name : names) {
            System.out.println(name);
        }
        // call by value or pass by value

        int value = 10;
        Main main = new Main();
        main.displayValue(value);

        // Call by reference
        main.displayReference(names);

        System.out.println(names);

    }
        void displayValue(int value){
            System.out.println("Value of variables in the method displayValue : "+ value);
            value = 20;
            System.out.println("Value of variables in the method displayValue : "+ value);
        }

        void displayReference(String[] names){
        System.out.println(names);
        }





}