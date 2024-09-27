// This is syncronized because everything is in sync , this working on a single thread.
import static java.lang.Thread.sleep;
class MyCounter{
    private int ThreadNo;
    public MyCounter(int ThreadNo){
        this.ThreadNo = ThreadNo;
    }

    public void countMe() throws InterruptedException{
        for(int i = 0; i <= 10; i++){
            sleep(500);
            System.out.println("Thread No: "+ThreadNo+ " iteration is: "+ i);
        }
    }

}

public class Thread1{
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);
        long startTime = System.currentTimeMillis();
        counter1.countMe();
        counter2.countMe();
        long endTime = System.currentTimeMillis();

        System.out.println(endTime- startTime);

    }
}