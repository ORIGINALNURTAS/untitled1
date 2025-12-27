public class Main {
    public static void main(String[] args) {

        ClothingItem jacket = new ClothingItem("Jacket", "Nike", "L", 120.0, true);
        Customer customer = new Customer("Alex", 20, 150.0, true);
        Store store = new Store("Urban Wear", "Almaty", true);

        System.out.println(jacket);
        System.out.println(customer);
        System.out.println(store);

        jacket.applyDiscount(10);
        store.sellItem(jacket, customer);
        System.out.println("\nAfter purchase:");
        System.out.println(jacket);
        System.out.println(customer);
        System.out.println(store);
    }
}
