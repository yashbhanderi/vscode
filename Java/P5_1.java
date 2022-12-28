class Product {
    int QUANTITY;
    int MRP;

    void setdata(int mrp, int quantity) {
        QUANTITY = quantity;
        MRP = mrp;
    }

    void display() {
        System.out.println("Quantity is " + QUANTITY + ".");
        System.out.println("MRP is " + MRP + ".");
    }
}

class Crockery extends Product {
    void displayinfo() {
        System.out.println("This is Crockery.");
    }
}

class Fooditems extends Product {
    void displayinfo() {
        System.out.println("This is Food-item and it is very very Healthy for body.");
    }
}

class Household extends Product {
    void displayinfo() {
        System.out.println("This is Household item and it is useful in day to day life.");
    }
}

class P5_1 {
    public static void main(String[] args) {
        System.out.println("Hello Yash Bhanderi!");
        Crockery croc1 = new Crockery();
        croc1.displayinfo();
        croc1.setdata(1000, 20);
        croc1.display();
        Fooditems f1 = new Fooditems();
        f1.displayinfo();
        f1.setdata(1000, 20);
        f1.display();
        Household hh1 = new Household();
        hh1.displayinfo();
        hh1.setdata(1000, 20);
        hh1.display();
    }
}