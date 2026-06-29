/*
Use the reverse method to implement isPalindrome. A number is a palin-
drome if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
 */
package week02.chapter06;

import java.util.Scanner;

public class PalindromeInteger6_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        if(isPalindrome(number)== true){
            System.out.println("The number is a palindrome.");
        }else {
            System.out.println("The number is not a palindrome.");
        }
    }

    public static int reverse(int number) {

        int digit, reverseNumber = 0;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            reverseNumber = (reverseNumber * 10) + digit;
        }
        return reverseNumber;
    }

    public static boolean isPalindrome(int number) {
if(reverse(number)== number){
    return true;
}else{
    return false;
}
    }
}
