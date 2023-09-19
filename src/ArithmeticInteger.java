import java.util.Scanner;

public class ArithmeticInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int firstValue = input.nextInt();
        System.out.print("Enter second integer:");
        int secondValue = input.nextInt();
        System.out.print("Enter third integer:");
        int thirdValue = input.nextInt();
        int addition = firstValue + secondValue + thirdValue;
        int product = firstValue * secondValue * thirdValue;
        int average = addition / 3;
        System.out.printf("Sum is %d%n", addition);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Average is %d%n", average);
        if (firstValue > secondValue) {
            System.out.printf("%d is largest ,%d is smallest ", firstValue, secondValue);
        }

        if (firstValue > thirdValue) {
            System.out.printf("%d is largest ,%d is smallest ", firstValue, thirdValue);
        }

        if (secondValue > firstValue) {
            System.out.printf("%d is largest ,%d is smallest ", secondValue, firstValue);
        }

        if (secondValue > thirdValue) {
            System.out.printf("%d is largest,%d is smallest", secondValue, thirdValue);
        }

        if (thirdValue > firstValue) {
            System.out.printf("%d is largest,%d is smallest", thirdValue, firstValue);
        }

        if (thirdValue > secondValue) {
            System.out.printf("%d is largest,%d is smallest", thirdValue, secondValue);
        }

    }
}
