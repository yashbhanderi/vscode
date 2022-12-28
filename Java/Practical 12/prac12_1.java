import java.io.*;
import java.util.*;

class Product {
    String name;
    int MRP;
    int Quantity;

    public Product(String name, int MRP, int Quantity) {
        this.name = name;
        this.MRP = MRP;
        this.Quantity = Quantity;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        ArrayList<Product> al = new ArrayList<>();
        int j = 0;

        while (true) {
            System.out.println("\n<--------------------------------------->");
            System.out.println("\n1. To Enter Data in Storage");
            System.out.println("2. To Buy a product");
            System.out.println("3. To Search a prduct");
            System.out.println("4. To Delete a product");
            System.out.println("5. To Show Product Storage");
            System.out.println("6. Exit from Menu\n");
            System.out.println("Enter your choice Here: ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    setData(al);
                    break;
                case 2:
                    System.out.println("Enter the name of the product to buy : ");
                    String s = br.readLine();
                    buy(al, s);
                    break;
                case 3:
                    System.out.println("Enter the product to be searched : ");
                    String se = br.readLine();
                    search(al, se);
                    break;
                case 4:
                    System.out.println("Enter product to be deleted : ");
                    String de = br.readLine();
                    Delete(al, de);
                    break;
                case 5:
                    display(al);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Enter a valid choice");
            }
            j++;
        }
    }

    static void setData(ArrayList<Product> al) throws IOException {
        System.out.println("Enter the name of product : ");
        String name = br.readLine();
        System.out.println("Enter the MRP for the new Product : ");
        int mrp = Integer.parseInt(br.readLine());
        System.out.println("Enter the quantity for the product : ");
        int quant = Integer.parseInt(br.readLine());
        al.add(new Product(name, mrp, quant));
    }

    static boolean search(ArrayList<Product> al, String toSearch) {
        boolean found = false;
        int mrp = -1;
        int quant = -1;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).name.equals(toSearch)) {
                found = true;
                mrp = al.get(i).MRP;
                quant = al.get(i).Quantity;
                break;
            }
        }
        if (found) {
            System.out.println("Product Details : ");
            System.out.println("MRP : " + mrp + " Quantity : " + quant);
            return true;
        } else {
            return false;
        }
    }

    static void Delete(ArrayList<Product> al, String todel) {
        if (!search(al, todel)) {
            System.out.println("Product not found , cannot be deleted ");
        } else {
            int ind = -1;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).name.equals(todel)) {
                    ind = i;
                    break;
                }
            }
            al.remove(ind);
            System.out.println("Product Removed");
        }
    }

    static void display(ArrayList<Product> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).name + " " + al.get(i).MRP + " " + al.get(i).Quantity);
        }
    }

    static void buy(ArrayList<Product> al, String tobuy) {
        if (!search(al, tobuy)) {
            System.out.println("Product not found , Cannot buy ");
        } else {
            int ind = -1;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).name.equals(tobuy)) {
                    ind = i;
                    break;
                }
            }
            if (al.get(ind).Quantity > 0) {
                System.out.println("Product bought ");
                al.get(ind).Quantity--;
            } else {
                System.out.println("all products sold , not product left to be bought");
            }
        }
    }
}
