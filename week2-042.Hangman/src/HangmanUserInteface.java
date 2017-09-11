
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        while (hangman.gameOn()) { //while the game is on
            System.out.println("Type a command: ");
            String command = reader.nextLine();

            //evaluate the command the user enters
            if (command.equals("quit")) { //if user requests to end the game
                break;
            } else if (command.equals("status")) { //if user requests status
                hangman.printStatus(); //run the printStatus method
                System.out.println();
            }
            else if (command.length() == 1) {  //if command has only one letter, so it must be a guess
                hangman.guess(command); //Guesses the letter that is given as a parameter for the guess method
            }
            else if (command.isEmpty()) { //if the user didnt type a letter
                printMenu(); //run the printMenu method again
            }
            hangman.printMan();
            hangman.printWord();
        }


        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
