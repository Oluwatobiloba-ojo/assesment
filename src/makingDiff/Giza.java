package makingDiff;

import java.util.Scanner;

public class Giza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the estimated number of stones: ");
        double numbersOfStone = scanner.nextDouble();
        System.out.print("Enter average weight of the stones: ");
        double weightOfStone = scanner.nextDouble();
        System.out.print("Enter number of years took to build: ");
        double year = scanner.nextDouble();
        double divide = weightOfStone / year;
        double result = divide / 12.0;
        double result1 = result / 31.0;
        double result2 = result / 24.0;
        double total = result2 / 60.0;
        System.out.printf("How much weight was built in a year %f%n", divide);
        System.out.printf("How much weight was built in an hour %f%n", result2);
        System.out.printf("How much weight was built in a minute %f%n", total);
    }
}
