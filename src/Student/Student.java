package Student;

public class Student {
    private String name;
    private int course;
    private int grade;

    public Student(String name, int course, int grade) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            this.name = "Undefined";
            System.out.println("Name should be at least 3 characters long. Set to 'Undefined'.");
        }

        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            this.course = 1;
            System.out.println("Invalid course. Set to default value 1.");
        }

        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            this.grade = 1;
            System.out.println("Invalid grade. Set to default value 1.");
        }
    }

    public void showInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
        System.out.println("Student Grade: " + grade);
    }
}
