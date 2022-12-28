package P7;

import java.util.*;

class P7_1 {
    public static void main(String[] args) {
        ArrayList<Crockery> crock = new ArrayList<Crockery>();
        Crockery cro1 = new Crockery();
        Crockery cro2 = new Crockery();
        Crockery cro3 = new Crockery();
        cro1.plates();
        cro1.details(1020, 30);
        cro2.cups();
        cro2.details(460, 2);
        cro3.jug();
        cro3.details(2100, 4);

        crock.add(cro1);
        crock.add(cro2);
        crock.add(cro3);

        Iterator<Crockery> itr = crock.iterator();
        while (itr.hasNext()) {
            Crockery ck = (Crockery) itr.next();
            System.out.println("Price:" + ck.price + "  Quantity: " + ck.quantity);
        }

        ArrayList<Household> house = new ArrayList<Household>();
        Household ho1 = new Household();
        Household ho2 = new Household();
        Household ho3 = new Household();
        ho1.spoons();
        ho1.details(440, 12);
        ho2.knives();
        ho2.details(600, 2);
        ho3.stoves();
        ho3.details(12000, 2);

        house.add(ho1);
        house.add(ho2);
        house.add(ho3);

        Iterator<Household> i = house.iterator();
        while (i.hasNext()) {
            Household ho = (Household) i.next();
            System.out.println("Price:" + ho.price + "  Quantity: " + ho.quantity);
        }

        ArrayList<Fooditems> food = new ArrayList<Fooditems>();
        Fooditems fo1 = new Fooditems();
        Fooditems fo2 = new Fooditems();
        Fooditems fo3 = new Fooditems();
        fo1.butter();
        fo1.details(90, 1);
        fo2.sunfloweroil();
        fo2.details(2500, 1);
        fo3.bread();
        fo3.details(200, 4);

        food.add(fo1);
        food.add(fo2);
        food.add(fo3);
        Iterator<Fooditems> ir = food.iterator();
        while (ir.hasNext()) {
            Fooditems it = (Fooditems) ir.next();
            System.out.println("Price:" + it.price + "  Quantity: " + it.quantity);
        }
    }
}

class Product {
    float price;
    int quantity;

    void details(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
}

class Crockery extends Product {
    void plates() {
        System.out.println("Plates");
    }

    void cups() {
        System.out.println("Cups");
    }

    void jug() {
        System.out.println("Jug");
    }
}

class Household extends Product {
    void spoons() {
        System.out.println("Spoons");
    }

    void knives() {
        System.out.println("Knives");
    }

    void stoves() {
        System.out.println("Stoves");
    }
}

class Fooditems extends Product {
    void butter() {
        System.out.println("Butter");
    }

    void sunfloweroil() {
        System.out.println("Sunfloweroil");
    }

    void bread() {
        System.out.println("Bread");
    }
}
