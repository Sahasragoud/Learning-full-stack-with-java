//Reverse an arraylist

import java.util.*;

public class Example1{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sahasra");
        names.add("Rushwitha");
        names.add("Siriveni");
        names.add("Suma");
        names.add("Ashwadhama");

        System.out.println(names);

// if needes a function 

      Collections.reverse(names);
      System.out.println(names);
 int n = names.size();
      for(int i = 0; i < n/2; i++){
        String temp = names.get(i);
        names.set(i,names.get(n-i-1));
        names.set(n-i-1,temp);
      }

      System.out.println(names);

    }
}