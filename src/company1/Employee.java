
package company1;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    Employee() {
        this.salary = 0.0;
        this.surname = "Undefined";
        this.id = 0;
    }

    private Employee(double salary, String surname) {
        this.salary = salary;
        this.surname = surname;
        this.id = 0;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public void displaySurname() {
        System.out.println("Surname: " + surname);
    }

    public void displayId() {
        System.out.println("ID: " + id);
    }
}
