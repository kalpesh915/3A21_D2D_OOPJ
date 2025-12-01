class Table{
    synchronized public void printTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * "+ i + " = " + (n * i));
            try{
                Thread.sleep(1000);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}

class Thread1 extends Thread{
    Table table;
    int n;
    Thread1(Table table, int n){
        this.table = table;
        this.n = n;
    }


    public void run(){
        table.printTable(n);
    }
}

class Thread2 extends Thread{
    Table table;
    int n;
    Thread2(Table table, int n){
        this.table = table;
        this.n = n;
    }

    public void run(){
        table.printTable(n);
    }
}

public class Pro8 {
    public static void main(String[] args) {
        Table table = new Table();

        Thread1 thread1 = new Thread1(table, 10);
        thread1.start();
        Thread2 thread2 = new Thread2(table, 15);
        thread2.start();

        try{
            //thread1.setPriority(0);
            //thread1.join(5000);
            System.out.println(thread1.isAlive());
            thread1.join();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }

        System.out.println("Main Thread is Over");
        System.out.println(thread1.isAlive());
    }
}
