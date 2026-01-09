import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clothing> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 Add Shirt");
            System.out.println("2 Add Pants");
            System.out.println("3 View All");
            System.out.println("0 Exit");

            int choice = sc.nextInt();
            if (choice == 0) break;

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Size: ");
                String size = sc.next();
                System.out.print("Long sleeve (true/false): ");
                boolean ls = sc.nextBoolean();
                items.add(new Shirt(name, price, size, ls));
            }

            if (choice == 2) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Size: ");
                String size = sc.next();
                System.out.print("Material: ");
                String material = sc.next();
                items.add(new Pants(name, price, size, material));
            }

            if (choice == 3) {
                for (Clothing c : items) {
                    System.out.println(c.info());
                }
            }
        }
    }
}
