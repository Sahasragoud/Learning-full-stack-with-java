import  java.lang.Thread;
public class EXample1 {
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException{
        new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i = 1; i < 50000; i++){
                    EXample1.counter++;
                }
                System.out.println("The loop in Thread1 is over");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i = 1; i < 50000; i++){
                    EXample1.counter++;
                }
                System.out.println("The loop in Thread2 is over");
            }
        }).start();
        Thread.sleep(300);
        System.out.println(counter);
    }
}
