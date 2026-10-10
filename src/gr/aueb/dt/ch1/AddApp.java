package gr.aueb.dt.ch1;

/**
 * Adds two integers and prints the result
 * on the screen / console (stdout).
 */
public class AddApp {

    public static void main(String[] args) {

        // Declare and initialize the variables
        int num1 = 5;
        int num2 = 10;
        int result = 0;

        // Statements for processing the input data
        result = num1 + num2;

        // Print the results
        System.out.println("The result is: " + result);
        System.out.println("The result of " + num1 + " and " + num2 + " is: " + result);
        System.out.printf("The result of %d and %d is: %d\n", num1, num2, result);
    }
}
