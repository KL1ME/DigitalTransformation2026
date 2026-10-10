package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature and if is raining and the program
 * decides if is snowing or not. The rule is that if both the
 * temperature is below zero and is raining then the result is that
 * is snowing.
 */
public class SnowingApp {

    public static void main(String[] args) {

        // Declare and initialize the variables
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        // Data input
        System.out.println("Please enter whether it is raining (true/false):");
        isRaining = scanner.nextBoolean();

        System.out.println("Please enter the temperature:");
        temperature = scanner.nextInt();

        // Process the data
        isSnowing = isRaining && (temperature < 0);     // short-circuit

        // print the results
        System.out.println("Is snowing? " + isSnowing);
    }
}
