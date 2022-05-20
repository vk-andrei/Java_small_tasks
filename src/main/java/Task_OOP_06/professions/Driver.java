package Task_OOP_06.professions;
import Task_OOP_06.Person;

public class Driver extends Person {
    final private int experience;

    public Driver(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("experience: %s years", experience);
    }
}
