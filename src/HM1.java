public class HM1 {
    static class myClass {
        int Year = 2023;

        public static int MYMETHOD(int a, int b) {
            int c = a + b;
            return c;
        }

        public static void main(String[] args) {
            int result = MYMETHOD(4, 6);
            System.out.println("Результат: " + result);
        }
    }
}
