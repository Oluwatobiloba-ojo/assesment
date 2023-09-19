import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int value = input.nextInt();
        System.out.print("Enter second number: ");
        int value2 = input.nextInt();
        int multiply = value * value * value;
        int multiple2 = value2 * value2;
        int result = multiply % multiple2;
        if (result == 0) {
            System.out.printf("%n%d is a multiple of %d%n", multiply, multiple2);
        }

        if (result != 0) {
            System.out.printf("%n%d is not a multiple of %d%n", multiply, multiple2);
        }

    }
}
