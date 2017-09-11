// The circumference of a circle is calculated using the formula 2 * pi * radius.
// Create a program that asks the user for the radius and then calculates the circumference using the given radius.
// Java already contains the value of pi in the Math.PI variable, which you can use in your calculation.

        import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.println("Type the radius: ");
        double radius = reader.nextDouble();

        System.out.println("Circumference of the circle: " + (Math.PI * 2 * radius));

    }
}
