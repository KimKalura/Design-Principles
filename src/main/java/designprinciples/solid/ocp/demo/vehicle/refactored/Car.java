package designprinciples.solid.ocp.demo.vehicle.refactored;

public class Car extends Vehicle{
    public Car(int value) {
        super(value);
    }

    @Override
    public int calculateValue() {
        return this.getValue() * 2;
    }
}
