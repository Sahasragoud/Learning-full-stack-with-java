//As w are having two threads sharing a same method we may face inconsistency.
//so to solve this we have synconized methods.--they they restrict the pausing of method in b/w.

class Brackets{
    synchronized public void generate(){
        for(int i = 0 ; i <= 20; i++){
            if ( i <= 10){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
        }
        System.out.println();

    }
}

public class Example2 {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i < 5; i++){
                    brackets.generate();
            }
            }
        }).start();

        new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i < 5; i++){
                    brackets.generate();
            }
            }
        }).start();
    }
}
