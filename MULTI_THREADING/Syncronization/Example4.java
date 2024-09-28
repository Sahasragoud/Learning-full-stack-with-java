//static syncronization
import static java.lang.Thread.sleep;
class Brackets{
    synchronized public static void generate() throws InterruptedException{
        for(int i = 0; i <= 20; i++){
            sleep(5);
            if(i <= 10) System.out.print("[");
            else System.out.print("]");
        }
        System.out.println();

        for(int i = 0; i < 10; i++){
            Thread.sleep(10);
        }    
    }   
}


class Example4{
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i =0 ; i < 5; i++){
                try{
                        Brackets.generate();                       
                    }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i =0 ; i < 5; i++){
                try{
                        Brackets.generate();                       
                    }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

            }
        }).start();
    }
}

