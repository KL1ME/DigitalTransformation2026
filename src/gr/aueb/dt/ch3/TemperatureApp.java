package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user provides the temperature and the
 * program responds if the temperature is below
 * zero or not.
 */
public class TemperatureApp {

    public static void main(String[] args) {

        // Declare and initialize variables
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTemperatureBelowZero = false;

        // Data input
        System.out.print("Please enter your temperature in Celsius: ");
        temperature = scanner.nextInt();

        // Process the data
        isTemperatureBelowZero = temperature < 0;

        // Print the results
        System.out.println("isTemperatureBelowZero? " + isTemperatureBelowZero);
    }
}
