package org.javaclaseses;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();
        numbers.push(25);
        numbers.push(35);
        numbers.push(45);
        numbers.push(55);
        numbers.push(65);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.isEmpty());//boolean
        System.out.println(numbers.search(55));//-1 or index num
        System.out.println(numbers.pop());
        System.out.println(numbers);
        System.out.println(numbers.peek()); // last item

    }
}