package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user enters an integer and the program
 * calculates the sum from 1 to the number
 * the user entered.
 */
public class SumApp {

    public static void main(String[] args) {

        // Declare and initialize the variables
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = 0;

        // Input data
        System.out.println("Please enter a number (int)");
        n = sc.nextInt();

        // Process the data
        while (i <= n) {
            sum += i;             //  sum = sum + i;
            i++;
        }

        // Print the result
        System.out.println("The sum is " + sum);
    }
}
