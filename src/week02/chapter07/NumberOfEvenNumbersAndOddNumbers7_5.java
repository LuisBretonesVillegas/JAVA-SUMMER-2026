/*2 stars
Write a program that reads ten
integers, and then display the number of even numbers and odd numbers. Assume
that the input ends with 0. Here is the sample run of the program.
 */
package week02.chapter07;

import java.util.Scanner;

public class NumberOfEvenNumbersAndOddNumbers7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = new int[10];
        //Fill the array with numbers
        System.out.println("Input 10 numbers, if you input 0 the program ends.");
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Imput the " + (i + 1) + " number: ");
            integers[i] = sc.nextInt();
            //break goes after the sc so it has a value
            if (integers[i] == 0) break;
        }
        //Calls the methods and prints the results
        int even = isEven(integers);
        int odd = isOdd(integers);
        System.out.println("There are " + even + " number/s.");
        System.out.println("There are " + odd + " number/s.");

    }

    //Looks if the number is even
    public static int isEven(int integer[]) {
        int even = 0; //have to put 0 so +1 can be added
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    //Looks if the number is odd
    public static int isOdd(int integer[]) {
        int odd = 0;//have to put 0 so +1 can be added
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }
}
