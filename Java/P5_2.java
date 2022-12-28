class Account {
    int acc_no;
    String name;
    double balance;

    void setdata(int uacc_no, String uname, double d) {
        acc_no = uacc_no;
        name = uname;
        balance = d;
    }

    void display() {
        System.out.println("Value of Account No. is " + acc_no + ".");
        System.out.println("Value of Name of account holder is " + name + ".");
        System.out.println("Value of Balance is " + balance + ".");
    }

    void deposit(double depositmoney) {
        balance = balance + depositmoney;
        System.out.println("Value of Balance after deposit " + depositmoney + " is " + balance + ".");
    }
}

class Savings extends Account {
    double interest_amount;

    void interest_on_balance(double interest_rate) {
        interest_amount = (balance * interest_rate) / 100;
        System.out.println("This is savings Account Information.Interest is not more than 8%");
        System.out.println("Value of Interest Amount on " + interest_rate + " is " + interest_amount + ".");
    }
}

class Current extends Account {
    double interest_amount;

    void interest_on_balance(double interest_rate) {
        interest_amount = (balance * interest_rate) / 100;
        System.out.println("This is Current Account Information.Interest is not more than 12%");
        System.out.println("Value of Interest Amount on " + interest_rate + " is " + interest_amount + ".");
    }
}

class P5_2 {
    public static void main(String[] args) {
        System.out.println("Hello Yash!");
        System.out.println("<------Information of Bank Account:----------------->");
        Savings acc1 = new Savings();
        acc1.setdata(521810165, "Yash Bhanderi", 82500.50);
        acc1.display();
        acc1.interest_on_balance(7.04);
        acc1.deposit(10000.00);
        System.out.println("<------Information of Bank Account:----------------->");
        Current acc2 = new Current();
        acc2.setdata(721610169, "Yash Bhanderi", 920900.50);
        acc2.display();
        acc2.interest_on_balance(10.0);
        acc2.deposit(100400.00);
    }
}