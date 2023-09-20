package makingDiff;

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial population: ");
        int initial = input.nextInt();
        System.out.println("Enter the year you want to confirm:  ");
        double time = input.nextDouble();
        System.out.println("Enter the rate of growth of the country: ");
        double rate = input.nextDouble();

        double add = 1 + rate;
        double power = Math.pow(add, time);
        int result = (int) (initial * power);
        System.out.println(result);
    }
}
