package Task_OOP_06.vehicles;

import Task_OOP_06.details.Engine;
import Task_OOP_06.professions.Driver;

public class SportCar extends Car {
    final private int maxSpeed;

    public SportCar(String modelName, String className, Driver driver, Engine engine, int maxSpeed) {
        super(modelName, className, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nmax speed %s km/h", maxSpeed);
    }
}
