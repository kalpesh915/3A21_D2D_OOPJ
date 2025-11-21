public class TablePrinter implements Runnable{

    Thread t;
    int ip;
    String name;
    TablePrinter(int ip, String name){
        this.t = new Thread(this, name);
        this.ip = ip;
        this.name = name;

        System.out.println("New Thread Created "+ t);
        t.start();
    }

    public void run(){
        // Thread Logic
        for(int i = 1; i <= 10; i++){
            System.out.println(ip + " * "+ i + " = "+ (ip * i));
            try {
                Thread.sleep(1000);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}
