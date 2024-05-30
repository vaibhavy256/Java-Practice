import java.util.*;
class Account {
    int bal;
    public Account(int b) {
        bal = b;
    }

    boolean isSufficientBal(int w) {
        if (bal > w) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int amt) {
        bal = bal - amt;
        System.out.println("Transaction Successful !");
        System.out.println("Current balance is:" + bal);
    }
}

class Customer implements  Runnable {
    Account x1;
    Customer(Account j1){
        x1=j1;
    }

    public void run (){
        synchronized (x1) {
            System.out.println("Enter amount to withdraw ");
            Scanner sc = new Scanner(System.in);
            int amt = sc.nextInt();
            if (x1.isSufficientBal(amt)) {
                x1.withdraw(amt);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        Account account1 = new Account(5000);
        Customer c1=new Customer(account1);
        Customer c2=new Customer(account1);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();

    }

}
