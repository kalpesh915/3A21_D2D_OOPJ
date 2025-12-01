class BankAccount {
    int balance = 10000; // Initial balance

    synchronized void withdraw(int amount) {
        System.out.println("Attempting to withdraw " + amount);
        if (this.balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); // Wait until a deposit happens
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.balance -= amount;
        System.out.println("Withdrawal completed. Remaining balance: " + this.balance);
    }

    synchronized void deposit(int amount) {
        System.out.println("Attempting to deposit " + amount);
        this.balance += amount;
        System.out.println("Deposit completed. Current balance: " + this.balance);
        notify(); // Notify a waiting thread (e.g., the withdraw thread)
    }
}

public class Pro10 {
    public static void main(String[] args) {
        final BankAccount account = new BankAccount();

        // Thread to attempt withdrawal
        new Thread() {
            public void run() {
                account.withdraw(15000); // Attempt to withdraw more than initial balance
            }
        }.start();

        // Thread to perform deposit
        new Thread() {
            public void run() {
                account.deposit(10000); // Deposit an amount
            }
        }.start();
    }
}