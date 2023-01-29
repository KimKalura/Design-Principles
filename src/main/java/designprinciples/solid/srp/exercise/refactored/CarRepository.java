package designprinciples.solid.srp.exercise.refactored;

//import designprinciples.solid.srp.exercise.dirty.Car;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    private List<Car> carsDb = Arrays
            .asList(new Car("1", "Golf III", "Volkswagen", 25000), new Car("2", "Multipla", "Fiat", 15000),
                    new Car("3", "Megane", "Renault", 17000));

    public Car findCarById(final String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> findAllCars(){
        return carsDb;
    }

}
