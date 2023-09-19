import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of radius: ");
        int radius = scanner.nextInt();
        int diameter = 2 * radius;
        double pie = 3.142;
        double circumference = 2.0 * pie * (double)radius;
        double area = pie * (double)radius * (double)radius;
        System.out.printf("%n%d is Diameter", diameter);
        System.out.printf("%n%f is Pi", 3.142);
        System.out.printf("%n%f is Circumference", circumference);
        System.out.printf("%n%f is Area", area);
    }
}
