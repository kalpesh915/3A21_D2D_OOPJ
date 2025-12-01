class Bank extends Thread{
    int balance;
    Bank(){
        balance = 15000;
    }

    void withdrawl(int amount){
        System.out.println("Withdrwal Started "+balance);
        if(amount > balance){
            try{
                wait();
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }

        balance = balance - amount;
        System.out.println("Withdrwal Completed "+balance);
    }

    void deposit(int amount){
        System.out.println("Deposit Started "+balance);
        balance = balance + amount;

        try{
            notify();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
        System.out.println("Deposit Completed "+balance);
    }
}

public class Pro9 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.withdrawl(25000);
        bank.deposit(30000);
    }
}
