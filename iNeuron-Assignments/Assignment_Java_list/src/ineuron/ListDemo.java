//Write a Java program that reads a set of integers from the user and stores them in a
//List. The program should then find the second largest and second smallest elements
//in the List.

package ineuron;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Find the second largest and second smallest elements
        int secondLargest = findSecondLargest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);

        scanner.close();
    }

    private static int findSecondLargest(List<Integer> numbers) {
        Collections.sort(numbers);
        int size = numbers.size();
        if (size >= 2) {
            return numbers.get(size - 2);
        } else {
            throw new IllegalArgumentException("List should have at least 2 elements.");
        }
    }

    private static int findSecondSmallest(List<Integer> numbers) {
        Collections.sort(numbers);
        int size = numbers.size();
        if (size >= 2) {
            return numbers.get(1);
        } else {
            throw new IllegalArgumentException("List should have at least 2 elements.");
        }
    }
}
