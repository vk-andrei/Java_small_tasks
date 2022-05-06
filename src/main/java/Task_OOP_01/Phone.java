package Task_OOP_01;

import static java.lang.System.in;

public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(){};

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void printInfo () {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Phone - number: %s, model: %s, weight %s.", number, model, weight);
    }

    public void receiveCall(String name) {
        System.out.printf("%s is calling\n", name);
    }

    public void receiveCall(String name, int num) {
        System.out.printf("%s is calling, his phone number: %s \n", name, num);
    }

    public int getNumber() {
        return number;
    }

    public void sendMessages (int... numbers) {
        for (int j : numbers) {
            System.out.printf("Sending message to: %s\n", j);

        }

    }



}
