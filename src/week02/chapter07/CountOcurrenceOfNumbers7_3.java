/*0 stars
 Write a program that reads the integers between
1 and 50 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:
 */
package week02.chapter07;

import java.util.Scanner;

public class CountOcurrenceOfNumbers7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Index 0 is unused so the number itself maps directly to its count
        int[] counts = new int[51];
        System.out.println("Enter the integers between 1 and 50 (end with 0): ");
        int number = sc.nextInt();
        while (number != 0) {
            if (number >= 1 && number <= 50) {
                counts[number]++;
            }
            number = sc.nextInt();
        }
        //Display the occurrences, skipping numbers that never appeared
        for (int i = 1; i <= 50; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i]
                        + (counts[i] == 1 ? " time" : " times"));
            }
        }
    }
}
