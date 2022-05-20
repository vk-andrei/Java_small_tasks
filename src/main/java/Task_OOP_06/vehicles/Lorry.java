package Task_OOP_06.vehicles;
import Task_OOP_06.details.Engine;
import Task_OOP_06.professions.Driver;

public class Lorry extends Car{
    final private int loadCapacity;

    public Lorry(String modelName, String className, Driver driver, Engine engine, int loadCapacity) {
        super(modelName, className, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nloadCapacity: %s", loadCapacity);
    }
}
