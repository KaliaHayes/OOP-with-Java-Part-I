
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = reader.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += (int)Math.pow(2, i);
        }
        System.out.println(sum);

    }
}
