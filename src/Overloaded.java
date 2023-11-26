public class Overloaded {
    public static void calculateAndPrint() {
        int number = 123;
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int sum = num1 + num2 + num3;

        System.out.println("Сумма цифр числа " + number + " равна " + sum);
    }

    public static void main(String[] args) {
        calculateAndPrint();
        printSum("hello", "world");
    }

    public static void printSum(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int sum = len1 + len2;

        System.out.println("Сумма длин слов " + word1 + " и " + word2 + " = " + sum);
    }

    public static void printSum(String word) {
        int length = word.length();
        System.out.println("Длина слова " + word + " равна " + length);
    }
}