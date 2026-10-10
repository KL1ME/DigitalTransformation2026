package gr.aueb.dt.ch2;

import java.util.Scanner;

/**
 * The user inserts their age (assume it is an integer)
 * and the program calculates and returns the age in days format.
 * Assume that 1 year = 365 days. For example, if the uses inserts
 * 20 (years) then the output should be 7300 days.
 */
public class YearsToDays {

    public static void main(String[] args) {

        // Declaration and initialization
        Scanner input = new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DAYS_IN_YEAR = 365;

        // Input and Data binding
        System.out.println("Please enter your age in years: ");
        inputAgeInYears = input.nextInt();

        // Process the data
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        // Print the results
        System.out.printf("Age in years: %d => Age in days:  %,d\n", inputAgeInYears, ageInDays);
    }
}
