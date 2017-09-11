//Create the method least, which returns the least of the numbers given as parameters.
//If the parameters are equal, you can decide which one is returned.

public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        if(number1<=number2){ //if num1 is less, return the value of 1
            return number1;
        } else { //else return value of num2 because it's obvs lesser
            return number2;
        }
    }

    public static void main(String[] args) {
        //run 2 and 7 thru the if statement in the least method
        //store the lesser num in the variable result
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
