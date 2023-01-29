package designprinciples.solid.ocp.demo.vehicle.refactored;

public class Bike extends Vehicle {
    public Bike(int value) {
        super(value);
    }

    @Override
    public int calculateValue() {
        return this.getValue() * 4;
    }
}
