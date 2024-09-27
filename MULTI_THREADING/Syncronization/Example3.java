class Brackets{
    private Object lock = "Lock";
     public void generate() throws InterruptedException{
        synchronized(lock){
            for(int i = 0; i <= 20; i++){
            Thread.sleep(5);
            if(i <= 10){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
        }
        System.out.println();
    }
        for(int i = 0; i < 10; i++){
            Thread.sleep(10);
        }
    }
}
public class Example3 {
   public static void main(String[] args) {
    Brackets brackets = new Brackets();
    new Thread(new Runnable() {
        public void run(){
            long startTime = System.currentTimeMillis();
            for(int i = 0; i < 5 ; i++){
                try{
                    brackets.generate();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total Time  Thread1 :"+ (endTime - startTime));

        }
    }).start();

    new Thread(new Runnable() {
        public void run(){
            long startTime = System.currentTimeMillis();
            for(int i = 0; i < 5 ; i++){
                try{
                    brackets.generate();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total Time Thread2: "+ (endTime - startTime));

        }
    }).start();
   } 
}

//Concept of syncronized block on objects:

/*
  Objects can be private.
  but when it comes to syncronization "this" means current object.Syncronization is enabled by java by taking use of intrisic lock or monitor loc.These locks should be safegaurded i.e., should be private.
  The logic won't be impacted but it's the best practise of using object than this instance.

 */