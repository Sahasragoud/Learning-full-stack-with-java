package org.javaclaseses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Getting started with the collections.

        ArrayList<String>listNames = new ArrayList<>();
        listNames.add("Sruthi");
        listNames.add("Ruchitha");
        listNames.add("Mayuri");
        listNames.add("Sahasra");
        listNames.add("Rushwitha");

        System.out.println(listNames);

        //how to access the elements of an arraylist.
//        for (String temp : listNames){
//            System.out.println(temp);
//        }

        //operations(or methods) in arraylist

        System.out.println(listNames.get(2));
        listNames.remove(3);
        System.out.println(listNames);
        listNames.remove("Sahasra");
        System.out.println(listNames);
        listNames.add(2,"Sahithi");
        System.out.println(listNames);
        System.out.println(listNames.indexOf("Mayuri"));
        System.out.println(listNames.size());
        System.out.println(listNames.contains("Sahasra"));






    }
}