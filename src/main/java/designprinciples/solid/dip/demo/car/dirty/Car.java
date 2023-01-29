package designprinciples.solid.dip.demo.car.dirty;

public class Car {

    private Engine engine;

    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}
