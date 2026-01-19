
import java.util.Scanner;

class Triangle {

    public static void squre(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangleRe(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = i; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void top_RightTriangle(int length) {
        for (int i = length; i > 0; i--) {

            for (int j = 0; j < length - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length : ");
        int length = sc.nextInt();
        // squre(length);
        // rightTriangleRe(length);
        // rightTriangle(length);
        top_RightTriangle(length);
    }
}
