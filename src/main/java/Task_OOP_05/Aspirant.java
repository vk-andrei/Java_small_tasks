package Task_OOP_05;

public class Aspirant extends Student{
    private String scienceWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return (averageMark == 5) ? 200 : 180;
    }
}
