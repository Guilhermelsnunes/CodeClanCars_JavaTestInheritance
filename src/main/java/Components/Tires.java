package Components;

public class Tires {
    private String brand;
    private double price;

    public Tires(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }
}
