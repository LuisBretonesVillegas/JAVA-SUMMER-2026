/*
Write a method that computes the sum of the digits
in an integer.
 */
package Semana_2.tema_6;

import java.util.Scanner;

public class sumDigitsInteger6_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the summatory of it's digits: ");
        long n = sc.nextInt();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(long n) {
        int digit, sumatory = 0;
        while(n>0){
            digit = (int) n%10;
            n = n/10;
            sumatory += digit;
        }
return sumatory;
    }
}
