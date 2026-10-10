package gr.aueb.dt.ch2;

import java.util.Scanner;

/**
 * Reads two integers from the standard input (keyboard)
 * and calculates the sum and prints the sum.
 */
public class AddScanner {

    public static void main(String[] args) {

        // Declaration and initialization of variables
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Reads the data and binds them to variables - data binding
        System.out.println("Enter two integers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Process the data
        sum = num1 + num2;

        // Print the results
        System.out.printf("The sum of %d and %d is: %d\n", num1, num2, sum);
    }
}
