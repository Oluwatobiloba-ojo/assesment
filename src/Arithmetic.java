import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Enter a number: ");
        int number2 = input.nextInt();

        int square1 = number2 * number2;
        int square = number * number;
        int sum = square + square1;
        int difference = square - square1;

        System.out.printf("""
                        Square of %d is %d
                        Square of %d is %d
                        addition of %d and %d is %d
                        differences between %d and %d is %d
                    """, number,square,number2,square1,square,square1,sum,square,square1,difference);
    }
}
