package Task_OOP_05;

public class Start {
    public static void main(String[] args) {

        Student aspirant2 = new Aspirant("Andrei", "Lyubishkin", 3, 4.5, "Amazon");
        Student student2 = new Student("Dima", "Tupishkin", 1, 5.0);
        Student student3 = new Student("Lexa", "shkin", 2, 3.1);
        Aspirant aspirant1 = new Aspirant("ei", "kin", 4, 5.0, "Google");

        Student[] students = {aspirant2, student2, student3, aspirant1};

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }


    }
}
