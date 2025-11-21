class ThreadDemo2 implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
    }
}

public class Pro4 {
    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        //threadDemo2.run();
        //threadDemo2.run();

        Thread t1 = new Thread(threadDemo2);
        t1.start();
        t1.start();
    }
}
