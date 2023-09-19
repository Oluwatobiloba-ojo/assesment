import java.util.Scanner;

public class Divisible3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondValue = scanner.nextInt();
        int result1 = firstValue % 3;
        int result2 = secondValue % 3;

        if (result1 == 0) {
            System.out.printf("%n%d is divisible by 3", firstValue);
        } else System.out.println("Its is not divisible by 3");


        if (result2 == 0) System.out.printf("%n%d is divisible by 3", secondValue);
        else System.out.println("Its is not divisible by 3 ");
    }
}
