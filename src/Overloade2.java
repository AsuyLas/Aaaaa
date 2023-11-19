import java.util.Scanner;

public class Overloade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int userInputInt = scanner.nextInt();
        boolean isPositiveInt = isPositive(userInputInt);
        System.out.println(isPositiveInt);

    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

}
