package designprinciples.solid.srp.exercise.refactored;

public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);
        CarController carController = new CarController(carService);
        System.out.println(carController.getMostExpensiveCar());
        System.out.println(carController.getCarsNames());

    }
}
