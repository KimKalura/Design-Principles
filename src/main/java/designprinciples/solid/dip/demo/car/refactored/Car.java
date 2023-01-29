package designprinciples.solid.dip.demo.car.refactored;

import designprinciples.solid.dip.demo.car.dirty.Engine;

public class Car {

    private Engine engine;
    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}
