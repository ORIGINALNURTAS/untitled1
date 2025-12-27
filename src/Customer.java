public class Customer {

    private String name;
    private int age;
    private double balance;
    private boolean premiumMember;

    public Customer() {
        this.name = "Guest";
        this.age = 18;
        this.balance = 0.0;
        this.premiumMember = false;
    }

    public Customer(String name, int age, double balance, boolean premiumMember) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.premiumMember = premiumMember;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean canBuy(double price) {
        return balance >= price;
    }

    public void buy(double price) {
        balance -= price;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', age=" + age +
                ", balance=" + balance + ", premiumMember=" + premiumMember + "}";
    }
}

