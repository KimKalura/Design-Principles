package designprinciples.solid.lsp.demo.vehicle.dirty;

public class Bike implements Vehicle{
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("I don't have an engine!");
    }

    @Override
    public void accelerate() {
        //accelerate bike
    }
}
