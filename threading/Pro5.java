class ThreadDemo3 extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
            System.out.print(i + " ");
        }
    }
}

public class Pro5 {
    public static void main(String[] args) {
        ThreadDemo3 threadDemo3 = new ThreadDemo3();
        threadDemo3.start();
    }
}
