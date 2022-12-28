import java.io.*;
import java.util.*;

class Customer extends Thread {
    String BankName;
    int Balance;

    public synchronized void buy(String name, int amount) {
        Balance = Balance - amount;
    }

    public static void main(String args[]) throws Exception {
        Customer c = new Customer();
        String bank = "SBI";
        int balance = 120000;
        c.BankName = bank;
        c.Balance = balance;
        // Thread for customer 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.buy(c.BankName, 5800);
            }
        });
        // Thread for customer 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.buy(c.BankName, 17000);
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println(c.Balance);
    }
}
