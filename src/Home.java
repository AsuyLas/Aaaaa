public class Home {
    public static void calculateAndPrintDigitSum() {
        int number = 674;
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;
        int sum = digit1 + digit2 + digit3;

        System.out.println("Сумма цифр числа " + number + " равна " + sum);
    }

    public static void main(String[] args) {
        calculateAndPrintDigitSum(); // Вызываем метод для вычисления и печати суммы цифр числа 123
    }
}
