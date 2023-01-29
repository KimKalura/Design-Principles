package designprinciples.solid.srp.exercise.refactored;

public class Car {

    private final String id;
    private final String model;
    private final String brand;
    private int price;

    public Car(String id, String model, String brand, int price)
    {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}