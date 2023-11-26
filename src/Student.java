public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private int course;
    private double mathGrade;
    private double economicsGrade;
    private double foreignLanguageGrade;

    public Student(int studentID, String firstName, String lastName, int course,
                   double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }

    public double calculateAverageGrade() {
        return (mathGrade + economicsGrade + foreignLanguageGrade) / 3.0;
    }

    public void displayAverageGrade() {
        System.out.println("Average grade for " + firstName + " " + lastName + ": " + calculateAverageGrade());
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Doe", 3, 4, 5, 4);
        Student student2 = new Student(2, "Alice", "Smith", 2, 5, 3, 4);
        Student student3 = new Student(3, "Emma", "Johnson", 4, 4, 4, 4);

        student1.displayAverageGrade();
        student2.displayAverageGrade();
        student3.displayAverageGrade();
    }
}

