public class ArrayDivision {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20};
        divideArray(array, 2);
    }

    public static void divideArray(int[] arr, int divisor) {
        System.out.println("Array after division by " + divisor + ":");

        for (int i = 0; i < arr.length; i++) {
            try {
                int result = arr[i] / divisor;

                System.out.println("Element " + i + ": " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error! Cannot divide by 0 or other exceptional situation.");
            }
        }
    }
}
