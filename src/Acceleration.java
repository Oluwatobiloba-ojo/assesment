import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial velocity: ");
        double value2 = input.nextDouble();
        System.out.print("Enter the final velocity: ");
        double value3 = input.nextDouble();
        System.out.print("Enter time taken: ");
        double value4 = input.nextDouble();
        double result = (value3 - value2) / value4;
        System.out.printf("The average acceleration is %.4f", result);
    }
}