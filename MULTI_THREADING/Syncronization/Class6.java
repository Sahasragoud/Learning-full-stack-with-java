public class Class6 {
    public static int balance = 0;
    synchronized public void withdraw(int amount) throws InterruptedException{
        if(balance <= 0) 
        {System.out.println("Waiting for the amount to be updated");
        wait();
    }
        balance = balance - amount;
        System.out.println("the current balance is :" + balance);
    }

    public void deposit(int amount){
        synchronized(this){
        System.out.println("We are depositing the amount");
        balance = balance + amount;
        System.out.println("the current balance is :" + balance);
        notify();
        }
    }
    public static void main(String[] args) {
        Class6 obj = new Class6();
        
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                try {
                    obj.withdraw(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setName("thread1");
        thread1.start();
    

    
        Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run(){
            obj.deposit(2000);
        }
    });
    thread2.setName("thread1");
    thread2.start();

}
}