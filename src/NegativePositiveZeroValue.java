import java.util.Scanner;

public class NegativePositiveZeroValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        int zeros = 0;
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.print("Enter fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.print("Enter fifth number: ");
        int fifthNumber = input.nextInt();
        if (firstNumber > 0) {
            ++positive;
        } else if (firstNumber < 0) {
            ++negative;
        } else {
            ++zeros;
        }

        if (secondNumber > 0) {
            ++positive;
        } else if (secondNumber < 0) {
            ++negative;
        } else {
            ++zeros;
        }

        if (thirdNumber > 0) {
            ++positive;
        } else if (thirdNumber < 0) {
            ++negative;
        } else {
            ++zeros;
        }

        if (fourthNumber > 0) {
            ++positive;
        } else if (fourthNumber < 0) {
            ++negative;
        } else {
            ++zeros;
        }

        if (fifthNumber > 0) {
            ++positive;
        } else if (fifthNumber < 0) {
            ++negative;
        } else {
            ++zeros;
        }

        System.out.printf("%n%d positive number", positive);
        System.out.printf("%n%d negative number", negative);
        System.out.printf("%n%d zeros input", zeros);
    }
}
