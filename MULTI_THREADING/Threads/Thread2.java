import static java.lang.Thread.sleep;

import java.util.Random;

class MyCounter implements Runnable{
    private int ThreadNo;
    public MyCounter(int ThreadNo){
        this.ThreadNo = ThreadNo;
    }
    @Override
    public void run(){
        try{
            countMe();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void countMe() throws InterruptedException{
        for(int i = 0; i < 10; i++){
            Random random = new Random();
            sleep(random.nextInt(1000));
            System.out.println("ThreadNo : "+ ThreadNo + " iteration no: " + i);
        }
    }
}
public class Thread2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));
        thread1.start();
        thread2.start();

    }
}

//we have 2 ways of creating thread clasess in java is beacuse we can crete an anonymous thread using Runnable interface.