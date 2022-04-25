package lesson_05;

public class Start {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Andrey", "boss", "vk-andrei@mail.ru",
                                   "8-919-795-66-21", 30000, 55);
        employeesArray[1] = new Employee("Dmitrii", "manager", "dmitri@mail.ru",
                "8-919-795-77-21", 15000, 39);
        employeesArray[2] = new Employee("Radmir", "manager", "radmir@mail.ru",
                "8-919-795-88-21", 15000, 42);
        employeesArray[3] = new Employee("Danya", "manager", "danya@mail.ru",
                "8-919-795-99-21", 15000, 39);
        employeesArray[4] = new Employee("Nick", "engineer", "nick@mail.ru",
                "8-919-795-00-21", 25000, 39);

        for (Employee employee : employeesArray) {
            if (employee.age > 40) {
                employee.showInfo();
            }
        }
    }
}

class Employee {

    String name;
    String position;
    String mail;
    String phone;
    int salary;
    int age;

    Employee(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Employee: " + name + "\n" + "Age: " + age + "\n" + "Position: " + position + "\n" +
                           "Mail: " + mail + "\n" + "Phone: " + phone + "\n");

    }

}