package company1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(3000.0, "Doe", 101);

        emp1.displaySalary();
        emp1.displaySurname();
    }
}
