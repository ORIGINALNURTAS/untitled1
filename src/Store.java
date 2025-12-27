public class Store {

    private String storeName;
    private String location;
    private int totalSales;
    private boolean open;

    public Store() {
        this.storeName = "Clothing Store";
        this.location = "Unknown";
        this.totalSales = 0;
        this.open = true;
    }

    public Store(String storeName, String location, boolean open) {
        this.storeName = storeName;
        this.location = location;
        this.open = open;
        this.totalSales = 0;
    }

    public String getStoreName() {
        return storeName;
    }

    public boolean isOpen() {
        return open;
    }

    public void sellItem(ClothingItem item, Customer customer) {
        if (item.isAvailable() && customer.canBuy(item.getPrice())) {
            customer.buy(item.getPrice());
            item.sellItem();
            totalSales++;
            System.out.println("Purchase successful!");
        } else {
            System.out.println("Purchase failed.");
        }
    }

    public void closeStore() {
        open = false;
    }

    @Override
    public String toString() {
        return "Store{name='" + storeName + "', location='" + location +
                "', totalSales=" + totalSales + ", open=" + open + "}";
    }
}
