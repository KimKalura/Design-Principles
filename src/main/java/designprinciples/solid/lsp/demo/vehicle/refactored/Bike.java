package designprinciples.solid.lsp.demo.vehicle.refactored;

public class Bike implements VehicleWithoutEngine {

    @Override
    public void accelerate() {
        //accelerate bike
    }

    @Override
    public void startMoving() {
        //bike starts moving
    }
}
