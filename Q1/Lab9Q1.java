import java.util.Scanner;

public class Lab9Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are real and different:");
            System.out.printf("Root 1: %.2f%n", x1);
            System.out.printf("Root 2: %.2f%n", x2);

        } else if (d == 0) {
            double x = -b / (2 * a);

            System.out.println("Roots are real and equal:");
            System.out.printf("Root: %.2f%n", x);

        } else {
            System.out.println("Roots are not real");
        }
    }
}