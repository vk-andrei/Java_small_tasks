package Task_OOP_06.vehicles;
import Task_OOP_06.details.Engine;
import Task_OOP_06.professions.Driver;

public class Car {
    final private String modelName;
    final private String className;
    final private Driver driver;
    final private Engine engine;

    public Car(String modelName, String className, Driver driver, Engine engine) {
        this.modelName = modelName;
        this.className = className;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("GO!");
    }

    public void stop() {
        System.out.println("STOP!");
    }

    public void turnRight() {
        System.out.println("Turn RIGHT");
    }

    public void turnLeft() {
        System.out.println("Turn LEFT");
    }
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("----------\nmodel: %s\nclass: %s\nengine: %s\ndriver: %s",
                              modelName, className, engine, driver);
    }
}

