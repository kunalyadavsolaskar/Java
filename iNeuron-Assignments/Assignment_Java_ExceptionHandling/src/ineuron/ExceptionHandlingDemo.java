//Write a Java programme that takes an integer from the user and throws an exception
//if it is negative.Demonstrate Exception handling of same program as solution.

package ineuron;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            int num = scanner.nextInt();

            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed!");
            }

            System.out.println("You entered: " + num);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: Enter only numbers" );
        } finally {
            scanner.close();
        }
    }
}
