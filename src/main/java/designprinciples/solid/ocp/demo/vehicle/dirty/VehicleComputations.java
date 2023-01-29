package designprinciples.solid.ocp.demo.vehicle.dirty;

import designprinciples.solid.ocp.demo.vehicle.refactored.Bike;
import designprinciples.solid.ocp.demo.vehicle.refactored.Car;
import designprinciples.solid.ocp.demo.vehicle.refactored.Vehicle;

public class VehicleComputations {

    //TODO: create subclasses of Vehicle and override calculateValue in each subclass
    public double calculateValue(Vehicle v) {
        if (v instanceof Car) {
            return v.getValue() * 0.8;
        }
        if (v instanceof Bike) {
            return v.getValue() * 0.5;
        }
        return 0;
    }

}
