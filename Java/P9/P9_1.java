package P9;

import java.util.Scanner;

class pra9_1 {
    public static void main(String[] args) {
        buyCar();
    }

    static void buyCar() {
        int price, budget;
        Scanner car = new Scanner(System.in);
        System.out.print("Price of the car : ");
        price = car.nextInt();
        System.out.print("Budget of the car : ");
        budget = car.nextInt();
        if (price > budget) {
            throw new ArithmeticException("Car is out of budget");
        } else {
            System.out.println("Car is in budget");
        }
    }
}
