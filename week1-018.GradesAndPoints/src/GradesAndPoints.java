
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int points = reader.nextInt();

        if (points <= 60 && 50 <= points) {
            System.out.println("Grade: 5");
        }
        else if (points <= 49 && 45 <= points) {
            System.out.println("Grade: 4");
        }
        else if (points <= 44 && 40 <= points) {
            System.out.println("Grade: 3");
        }
        else if (points <= 39 && 35 <= points) {
            System.out.println("Grade: 2");
        }
        else if (points <= 34 && 30 <= points) {
            System.out.println("Grade: 1");
        }
        else if (points <= 29 && 0 <= points) {
            System.out.println("failed");
        }

    }
}
