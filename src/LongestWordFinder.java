public class LongestWordFinder {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        String word3 = "orange";

        String longestWord = findLongestWord(word1, word2, word3);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String word1, String word2, String word3) {
        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();



        if (length1 >= length2 && length1 >= length3) {
            return word1;
        } else if (length2 >= length1 && length2 >= length3) {
            return word2;
        } else {
            return word3;
        }
    }
}
