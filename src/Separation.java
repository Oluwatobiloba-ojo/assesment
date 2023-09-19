import java.util.Scanner;

public class Separation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number consisting of five integer: ");
        int number = scanner.nextInt();
        int firstDigit = number / 10000;
        int secondDigit = number / 1000 % 10;
        int thirdDigit = number / 100 % 10;
        int fourthDigit = number / 10 % 10;
        int lastDigit = number % 10;
        System.out.printf("%d\t %d\t %d\t %d\t %d\t", firstDigit, secondDigit, thirdDigit, fourthDigit, lastDigit);
    }
}
