package makingDiff;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pound: ");
        int value1 = input.nextInt();
        System.out.print("Enter the height in inche: ");
        int value2 = input.nextInt();
        int product = value2 * value2;
        int result = value1 * 730;
        double division = (double)(result / product);
        System.out.println("Multiply inch by inch ");
        System.out.printf("%d & %d is %d%n", value2, value2, product);
        System.out.println("Convert pound to Kilogram ");
        System.out.printf("%d & 730 is %d%n", value1, result);
        System.out.println("Weight by 730 divided by product of the inches");
        System.out.printf("%d / %d is %f%n", result, product, division);
    }
    }
