//Given the input 0, -31, -40, 15, 16, 39, 41, 49, 0, you should add to graph only values 0, 15, 16, 39, 0. More info: java.lang.AssertionError:
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.

        while (true) {
            System.out.println("Enter a temperature:");
            double numTemp = Double.parseDouble(reader.nextLine());

            if (numTemp >= -30 && numTemp < +40) {
                Graph.addNumber(numTemp);
            }

        }
    }
}