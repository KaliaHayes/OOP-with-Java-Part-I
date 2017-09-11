// Create a program that reads numbers from the user and prints their sum.
// The program should stop asking for numbers when user enters the number 0. T

        import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            // DO SOMETHING HERE
            else if (read != 0) {
                sum = sum + read;
            }
            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
}
