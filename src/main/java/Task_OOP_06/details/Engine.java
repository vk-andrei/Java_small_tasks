package Task_OOP_06.details;

public class Engine {
    final private String madeBy;
    final private int power;

    public Engine(String madeBy, int power) {
        this.madeBy = madeBy;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("%s h/p, made by %s", power, madeBy);
    }
}
