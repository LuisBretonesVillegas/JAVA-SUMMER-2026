/*
 Write a method that averages all the
numbers in the major diagonal in an n * n matrix of double values using the
following header:
public static double averageMajorDiagonal(double[][] m)
Write a test program that reads a 4-by-4 matrix and displays the average of all its
elements on the major diagonal. Here is a sample run:
 */
package Semana_2.tema_8;

import java.util.Scanner;

public class averageMayorDiagonal8_2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double m[][] = new double[4][4];
        System.out.println("Enter 4 by 4 matrix row by row:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter the data on the position " + "[" + i + "] " + "[" + j + "] ");
                m[i][j] = sc.nextDouble();
            }
        }

        System.out.println("The average of the elements in the major diagonal is " + averageMajorDiagonal(m));

    }

    public static double averageMajorDiagonal(double[][] m) {
        double diagonalSummatory = 0;
        double average;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    diagonalSummatory += m[i][j];
                }
            }
        }
        return average = diagonalSummatory / 4;
    }
}
