package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user enters positive integers and the
 * program calculates the count of positives.
 *
 * The condition to stop counting is the first
 * negative integer. This condition is called
 * a 'sentinel'
 */
public class PositivesCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please enter a positive number (negative for exit)");
//        num = sc.nextInt();

        while ((num = sc.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("Please enter another positive number (negative for exit)");
            num = sc.nextInt();
        }

        System.out.println("The positive number count is: " + positivesCount);
    }
}
