package designprinciples.solid.srp.exercise.refactored;

import designprinciples.solid.srp.exercise.refactored.Car;

import java.util.List;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        List<Car> carsDB = carRepository.findAllCars();
        for (Car car : carsDB) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car findMostExpensiveCar() {
        List<Car> carsDB = carRepository.findAllCars();
        Car bestCar = carsDB.get(0);

        for (Car car : carsDB) {
            if (car.getPrice() > bestCar.getPrice()) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
