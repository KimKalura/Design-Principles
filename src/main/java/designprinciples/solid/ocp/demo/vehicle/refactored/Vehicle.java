package designprinciples.solid.ocp.demo.vehicle.refactored;

public abstract class Vehicle {
    private int value;

    public Vehicle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract int calculateValue();
}
