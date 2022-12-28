import java.io.*;
import java.util.*;

class Customer extends Thread {
    String ProductName;
    int quantity;

    public synchronized void buy(String name, int times) {
        quantity = quantity - times;
    }

    public static void main(String args[]) throws Exception {
        Customer c = new Customer();
        String prod = "Colin";
        int qut = 10;
        c.ProductName = prod;
        c.quantity = qut; // Thread for customer 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.buy(c.ProductName, 5);
                // customer 1 buys 5 times
            }
        });
        // Thread for customer 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.buy(c.ProductName, 2);
                // custome 2 buys 2 times
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println(c.quantity);
    }
}
