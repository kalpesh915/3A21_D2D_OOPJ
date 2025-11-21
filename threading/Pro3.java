class ThreadDemo1 implements Runnable{
 public void run(){
     System.out.println("Thread is Running");
 }
}

public class Pro3 {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        //threadDemo1.run();
        Thread t1 = new Thread(threadDemo1);
        t1.start();
    }
}
