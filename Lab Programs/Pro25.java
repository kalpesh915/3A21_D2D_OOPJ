package q63229;
import java.util.Scanner;
class ProdCons {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of items to be produced and consumed: ");
        int numItems = sc.nextInt();
        Product p = new Product(numItems);
        Thread producerThread = new Thread(new Producer(p));
        Thread consumerThread = new Thread(new Consumer(p));
        producerThread.start();
        consumerThread.start();
        sc.close();
    }
}

class Product {
    
    int n;
    boolean isItemReady = false;
    int itemsToProduce;

    // Constructor to initialize the number of items to be produced
    Product(int items) {
        this.itemsToProduce = items;
    }

    synchronized void get() {
        while (isItemReady == false) {
            try {
                wait(); // Wait until an item is produced
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("GET: " + n);
        isItemReady = false; // Mark that the item is consumed
        notify(); // Notify the producer that the item is consumed
       // return n;
    }

    synchronized void put(int n) {
        while (isItemReady == true) {
            try {
                wait(); // Wait until the item is consumed
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        isItemReady = true; // Mark that the item is produced
        System.out.println("PUT: " + n);
        notify(); // Notify the consumer that the item is produced
    }
    
    

    
            
}

class Producer implements Runnable {
   Product q;

    // Constructor to initialize the product
    Producer(Product q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (i < q.itemsToProduce) {
            q.put(i++);  // Produce items from 0 to numItems
        }
    } 
    
    
    
}

class Consumer implements Runnable {
     Product q;

    // Constructor to initialize the product
    Consumer(Product q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (i < q.itemsToProduce) {
            q.get();  // Consume the produced items
            i++;
        }
    }
        
    
}
