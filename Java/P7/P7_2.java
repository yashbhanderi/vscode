package P7;

import java.util.*;

class P7_2 {
    public static void main(String[] args) {
        ArrayList<Saving> sav = new ArrayList<Saving>();
        Saving a1 = new Saving();
        a1.details(8678754, "Yash Bhanderi", 866.22f, 556f, 8.7f);

        sav.add(a1);

        Iterator<Saving> itr = sav.iterator();
        while (itr.hasNext()) {
            Saving sa = (Saving) itr.next();
            System.out.println("\nINFORMATION OF SAVING ACCOUNT");
            System.out.println("\nACCOUNT NUMBER:" + sa.acno + "\nNAME OF ACCOUNT HOLDER: " + sa.name + "\nBALANCE :"
                    + sa.balance + "\nDEPOSITE :" + sa.deposite + "\nINTEREST:" + sa.interest);
        }
        a1.Deposite();
        a1.interestrate();

        ArrayList<Current> cur = new ArrayList<Current>();
        Current a2 = new Current();
        a2.details(854534, "Yash Bhanderi", 878.22f, 864f, 8.6f);

        cur.add(a2);

        Iterator<Current> it = cur.iterator();
        while (it.hasNext()) {
            Current cu = (Current) it.next();
            System.out.println("\nINFORMATION OF CURRENT ACCOUNT");
            System.out.println("\nACCOUNT NUMBER:" + cu.acno + "\nNAME OF ACCOUNT HOLDER: " + cu.name + "\nBALANCE :"
                    + cu.balance + "\nDEPOSITE :" + cu.deposite + "\nINTEREST:" + cu.interest);
        }
        a2.Deposite();
        a2.interestrate();
    }
}

class Account {
    final float percent = 100;
    int acno;
    String name;
    float balance;
    float deposite;
    float interest;

    void details(int acno, String name, float balance, float deposite, float interest) {
        this.acno = acno;
        this.name = name;
        this.balance = balance;
        this.deposite = deposite;
        this.interest = interest;
    }
}

class Saving extends Account {
    void Deposite() {
        balance = balance + deposite;
        System.out.println("Balance after deposite:" + balance);
    }

    void interestrate() {
        interest = (balance * interest) / percent;
        System.out.println("Amount of interest:" + interest);
    }
}

class Current extends Account {
    void Deposite() {
        balance = balance + deposite;
        System.out.println("Balance after deposite:" + balance);
    }

    void interestrate() {
        interest = (balance * interest) / percent;
        System.out.println("Amount of interest:" + interest);
    }
}
