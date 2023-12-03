public class MinDifference {
    public static void main(String[] args) {
        int[] numbers = {5, 11, 7, 20};
        int minDiff = findMinDifference(numbers);
        System.out.println("The smallest value of the difference in modulus: " + minDiff);
    }

    public static int findMinDifference(int[] arr) {
        if (arr.length < 2) {
            System.out.println("The array must contain at least two numbers");
            return -1;
        }

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < minDifference) {
                    minDifference = diff;
                }
            }
        }

        return minDifference;
    }
}
