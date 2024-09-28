import static java.lang.Thread.sleep;

public class Class5 {
    volatile public static int flag = 0;
   public static void main(String[] args) {
    new Thread(new Runnable() {
        @Override
        public void run(){
            int i = 0;
            while(i >= 0){
                if(flag == 0) System.out.println(i + " : Running..");
                i++;
            }
        }
    }).start();

    new Thread(new Runnable() {
        @Override
        public void run(){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = 1;
            System.out.println("flag value has been updated");
        }
    }).start();;


   } 
}
