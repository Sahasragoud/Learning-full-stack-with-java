package org.javaclaseses;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(58);
        numbers.push(84);
        numbers.push(57);
        int x= numbers.search(84);
        System.out.println(x);
        System.out.println(numbers.get(1));
    }
}