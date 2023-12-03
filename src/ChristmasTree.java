public class ChristmasTree {
    public static void main(String[] args) {
        drawChristmasTree(5);
        System.out.println();
        drawInvertedChristmasTree(5);
        System.out.println();
        drawTriangle(5);
    }

    public static void drawChristmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawInvertedChristmasTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = height; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
