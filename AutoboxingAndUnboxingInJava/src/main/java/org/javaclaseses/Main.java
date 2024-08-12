package org.javaclaseses;
import java.util.ArrayList;

class IntWrapper{
    public int num;

    public IntWrapper(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numlist = new ArrayList<>();
        numlist.add(25);
        numlist.add(5);//autoboxing
        System.out.println(numlist);
        System.out.println(numlist.get(0));//auto unboxing


        ArrayList<IntWrapper> numlist2 = new ArrayList<>();
        numlist2.add(new IntWrapper(65));//boxing
        numlist2.add(new IntWrapper(55));
        System.out.println(numlist2.get(0).getNum());// unboxing


        ArrayList<Double> listnums = new ArrayList<>();
        listnums.add(Double.valueOf(27.65));
        listnums.add(Double.valueOf(87.5)); //autoboxing
        System.out.println(listnums.get(0).doubleValue());


    }
}