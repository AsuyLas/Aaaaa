import java.util.Scanner;

public class Overloade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int userInputInt = scanner.nextInt();
        boolean isPositiveInt = isPositive(userInputInt);
        System.out.println(isPositiveInt);

        System.out.println("Введите число с плавающей точкой:");
        double userInputDouble = scanner.nextDouble();
        boolean isPositiveDouble = isPositive(userInputDouble);
        System.out.println(isPositiveDouble);
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }
}
