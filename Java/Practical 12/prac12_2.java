import java.io.*;
import java.util.*;

class Account {
    String name;
    int acno;
    int bal;

    public Account(String name, int acno, int bal) {
        this.name = name;
        this.acno = acno;
        this.bal = bal;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        ArrayList<Account> al = new ArrayList<>();
        while (true) {
            System.out.println("\n1. To Add a account holder");
            System.out.println("2. To Withdraw amount");
            ;
            System.out.println("3. To Search for an account");
            System.out.println("4. To Delete an account ");
            System.out.println("5. To Show all the accounts ");
            System.out.println("6. Exit \n");

            System.out.println("Enter your choice : ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    setData(al);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn and account number : ");
                    int am = Integer.parseInt(br.readLine());
                    int ac = Integer.parseInt(br.readLine());
                    withdraw(al, ac, am);
                    break;
                case 3:
                    System.out.println("Enter the account number to be searched : ");
                    int acc = Integer.parseInt(br.readLine());
                    search(al, acc);
                    break;
                case 4:
                    System.out.println("Enter Account to be deleted : ");
                    int acco = Integer.parseInt(br.readLine());
                    Delete(al, acco);
                    break;
                case 5:
                    display(al);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }

    static void setData(ArrayList<Account> al) throws IOException {
        System.out.println("Enter the name of Account holder : ");
        String name = br.readLine();
        System.out.println("Enter the Account number : ");
        int mrp = Integer.parseInt(br.readLine());
        System.out.println("Enter the balance in the account : ");
        int quant = Integer.parseInt(br.readLine());
        al.add(new Account(name, mrp, quant));
    }

    static boolean search(ArrayList<Account> al, int no) {
        boolean found = false;
        int ind = -1;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).acno == no) {
                found = true;
                ind = i;
                break;
            }
        }
        if (found) {
            System.out.println("Account Details : ");
            System.out.println("Name: " + al.get(ind).name + "\nBalance: " + al.get(ind).bal + " " + "\nAccount no: "
                    + al.get(ind).acno);
            return true;
        } else {
            return false;
        }
    }

    static void Delete(ArrayList<Account> al, int no) {
        if (!search(al, no)) {
            System.out.println("Account not found , cannot be deleted ");
        } else {
            int ind = -1;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).acno == no) {
                    ind = i;
                    break;
                }
            }
            al.remove(ind);
            System.out.println("Account Removed");
        }
    }

    static void display(ArrayList<Account> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).name + " " + al.get(i).acno + " " + al.get(i).bal);
        }
    }

    static void withdraw(ArrayList<Account> al, int no, int amount) {
        if (!search(al, no)) {
            System.out.println("Account not found , Cannot withdraw ");
        } else {
            int ind = -1;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).acno == no) {
                    ind = i;
                    break;
                }
            }
            if (amount > al.get(ind).bal) {
                System.out.println("Cannot withdraw more than balance");
            } else {
                System.out.println("Amount withdrawn ");
                al.get(ind).bal -= amount;
                System.out.println("Reamining Balance: " + al.get(ind).bal);
            }
        }
    }
}
