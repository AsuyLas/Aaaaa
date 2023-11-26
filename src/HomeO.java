public class HomeO {
    public static void main(String[] args) {
        printSum("hello ", "world ");
    }

    public static void printSum(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int sum = len1 + len2;
        System.out.println("Sum of word lengths " + word1 + " and " + word2 + " = " + sum);
    }

    public static void printSum(String word) {
        int length = word.length();
        System.out.println("Word length " + word + " = " + length);
    }
}
