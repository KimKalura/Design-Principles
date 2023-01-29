package designprinciples.solid.srp.exercise.refactored;

import designprinciples.solid.srp.exercise.refactored.Car;

public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    public String getCarsNames (){
        return carService.getCarsNames();
    }

    public Car  getMostExpensiveCar(){
        return carService.findMostExpensiveCar();
    }


}
