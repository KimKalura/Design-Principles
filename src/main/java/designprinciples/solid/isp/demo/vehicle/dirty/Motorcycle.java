package designprinciples.solid.isp.demo.vehicle.dirty;

public class Motorcycle implements Vehicle {

    // Can be implemented
    public void drive() {
    }

    public void stop() {
    }

    public void refuel() {
    }

    // Can not be implemented
    public void openDoors() {
        throw new UnsupportedOperationException();
    }
}
