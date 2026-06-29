/*0 stars
Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter 10 double values, invokes this
method, then displays the average value.
 */
package week02.chapter07;

import java.util.Scanner;

public class AverageAnArray7_8 {
    static void main(String[] args) {
        int[] array = new int[10];
        double[] array2 = new double[10];
        double average = average(array2);
        System.out.println("The average in double value is: " + average);
    }

    //Makes the average with integers
    public static int average(int[] array) {
        Scanner sc = new Scanner(System.in);
        int average, count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter 10 int values: ");
            array[i] = sc.nextInt();
            count += array[i];
        }
        average = count / array.length;
        return average;
    }

    //Makes the average with decimals
    public static double average(double[] array2) {
        Scanner sc = new Scanner(System.in);
        double average, count = 0;
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter 10 double values: ");
            array2[i] = sc.nextDouble();
            count += array2[i];
        }
        average = count / array2.length;
        return average;
    }
}
