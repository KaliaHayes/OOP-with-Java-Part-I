
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number?");
        int one = 1;
        int num = reader.nextInt();

        while (one <= num) {
            System.out.println(one);
            one = ++one;
        }
    }
}
