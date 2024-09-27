//Sometimes we use a thread for only once and once exectued they are no longer useful.
//so for such thread we need not to waste the resourses and also the space(object is also not needed)
import static java.lang.Thread.sleep;

import java.util.Random;

public class Thread21 {
    public static void main(String[] args) throws InterruptedException {
       // Thread thread1 = new Thread(new Runnable() {
            new Thread(new Runnable() { 
                @Override
                public void run(){
                for(int i = 0; i < 10; i++){
                    try{
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    }
                    catch(Exception e ){
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }).start();
        //thread1.start();

    }
}

//we have 2 ways of creating thread clasess in java is beacuse we can crete an anonymous thread using Runnable interface.
