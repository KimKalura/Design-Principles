package designprinciples.solid.ocp.demo.vehicle.refactored;

public class Truck extends Vehicle{
    public Truck(int value) {
        super(value);
    }

    @Override
    public int calculateValue() {
        return this.getValue() * 3;
    }
}
