
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int num = reader.nextInt();
        int count = 1;
        while (num != numberDrawn) {
            if (num > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + count);
                System.out.println("Guess a number: ");
                num = reader.nextInt();
            }
            else {
                System.out.println("The number is greater, guesses made: " + count);
                System.out.println("Guess a number: ");
                num = reader.nextInt();
            }
            count++;
        }
        if (num == numberDrawn) {
            System.out.println("Congratulations, your guess is correct!");
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
