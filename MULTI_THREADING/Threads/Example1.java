//In multi-threading we can concurrently run the applications.
//Even main is also a thread, and jvm create those 2 indepedent threads and even after the main method is done , they conotinue to run.


import static java.lang.Thread.sleep;

class MyCounter extends Thread{
    private int ThreadNo;
    public MyCounter(int ThreadNo){
        this.ThreadNo = ThreadNo;
    }
    @Override
    public void run(){
        try{
            countMe();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void countMe() throws InterruptedException{
        for(int i = 0; i < 10; i++){
            sleep(500);
            System.out.println("Thread No " + ThreadNo + " itearation No: "+ i);
        }
    }
}

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

    MyCounter counter1 = new MyCounter(1);
    MyCounter counter2 = new MyCounter(2);
    MyCounter counter3 = new MyCounter(3);

    long startTime = System.currentTimeMillis();
    counter1.start();
    counter2.start();
    counter3.start();
    sleep(6000);
    long endTime = System.currentTimeMillis();
    System.out.println(endTime-startTime);
}
}