import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num = reader.nextInt();
        int sum = 0;
        int count = 00;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                break; //break bc the code is complete5
            }
            else {
                sum += num;
                count++;
                if (num%2 == 0) {
                    evenCount++;
                }
                else {
                    oddCount++;
                }
            }
            num = reader.nextInt(); //read the next number and run it thru the while loop again
        } //end of while loop

        System.out.println("The sum is " + sum); //print the calculated sum
        System.out.println("How many numbers: " + count);
        System.out.println("The average is " + (double)(sum)/(double)(count));
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

    }
}
