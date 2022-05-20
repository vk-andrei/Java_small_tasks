package Task_OOP_06;

import Task_OOP_06.details.Engine;
import Task_OOP_06.professions.Driver;
import Task_OOP_06.vehicles.Car;
import Task_OOP_06.vehicles.Lorry;
import Task_OOP_06.vehicles.SportCar;

public class Start {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Andrei", 39, 12);
        Engine engine1 = new Engine("Russia", 87);
        Engine engine2 = new Engine("Russia", 250);
        Engine engine3 = new Engine("Germany", 300);

        Car car1 = new Car("Lada", "sedan", driver1, engine1);
        Car car2 = new Lorry("Maz", "Lorry", driver1, engine2, 2000);
        Car car3 = new SportCar("BMV", "F1", driver1, engine3, 325);

        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
    }
}
