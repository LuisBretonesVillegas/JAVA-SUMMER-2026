/* 1 star
Write a method that returns the sum of all the ele-
ments in a specified row in a matrix using the following header:
public static double sumRow(double[][] m, int rowIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each row.
Here is a sample run:
 */
package week02.chapter08;

import java.util.Scanner;

public class SumElementsRowByRow8_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m[][] = new double[3][4];
        System.out.println("Enter 3 by 4 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter the data on the position " + "[" + i + "] " + "[" + j + "] ");
                m[i][j] = sc.nextDouble();
            }
        }
        //Prints in console the result, in sumrow we put m because is the matrix we want to fill and the loop for is for the rows so it is always i
        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of row " + (i + 1) + " is " + sumRow(m, i));
        }
    }

    //Makes the operation
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        for (int j = 0; j < m[rowIndex].length; j++) {
            sum += m[rowIndex][j];
        }
        return sum;
    }
}
