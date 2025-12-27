public class ClothingItem {

    private String name;
    private String brand;
    private String size;
    private double price;
    private boolean available;
    public ClothingItem() {
        this.name = "Unknown";
        this.brand = "No brand";
        this.size = "M";
        this.price = 0.0;
        this.available = true;
    }
    public ClothingItem(String name, String brand, String size, double price, boolean available) {
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public void sellItem() {
        available = false;
    }

    @Override
    public String toString() {
        return "ClothingItem{name='" + name + "', brand='" + brand + "', size='" + size +
                "', price=" + price + ", available=" + available + "}";
    }
}

