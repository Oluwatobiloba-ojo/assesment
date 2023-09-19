import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int value = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int value2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int value3 = scanner.nextInt();
        System.out.print("Enter four integer: ");
        int value4 = scanner.nextInt();
        System.out.print("Enter fifth integer: ");
        int value5 = scanner.nextInt();
        if (value > value2 && value > value3 && value > value4 && value > value5) {
            System.out.printf("%d is largest", value);
        }

        if (value2 > value && value2 > value3 && value2 > value4 && value2 > value5) {
            System.out.printf("%d is largest", value2);
        }

        if (value3 > value && value3 > value2 && value3 > value4 && value3 > value5) {
            System.out.printf("%d is largest", value3);
        }

        if (value4 > value && value4 > value2 && value4 > value3 && value4 > value5) {
            System.out.printf("%d is largest", value4);
        }

        if (value5 > value && value5 > value2 && value5 > value3 && value5 > value4) {
            System.out.printf("%d is largest", value5);
        }

        if (value < value2 && value < value3 && value < value4 && value < value5) {
            System.out.printf("%d is smallest", value);
        }

        if (value2 < value && value2 < value3 && value2 < value4 && value2 < value5) {
            System.out.printf("%d is smallest", value2);
        }

        if (value3 < value && value3 < value2 && value3 < value4 && value3 < value5) {
            System.out.printf("%d is smallest", value3);
        }

        if (value4 < value && value4 < value2 && value4 < value3 && value4 < value5) {
            System.out.printf("%d is smallest", value4);
        }

        if (value5 < value && value5 < value2 && value5 < value3 && value5 < value4) {
            System.out.printf("%d is smallest", value5);
        }
    }
}
