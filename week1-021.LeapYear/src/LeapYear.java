
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a year: ");
        int year = reader.nextInt();

        boolean leapYear = year%4 == 0;

        if (leapYear && (year%100 != 0 || year%400 == 0)) {
                System.out.println("This is a leap year.");
            }
        else {
            System.out.println("This is not a leap year.");
        }
    }
}
