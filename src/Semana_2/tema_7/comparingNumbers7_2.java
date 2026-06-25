/*0 stars
Write a program that reads 11 integers, compares each
integer with the 11th integer, and displays whether the integers are “greater”,
“smaller”, or “equal” to the 11th integer
 */
package Semana_2.tema_7;

public class comparingNumbers7_2 {
    public static void main(String[] args) {
        int[] array = {21, 14, 5, 2, 4, 5, 30, 67, 23, 123, 30};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[10]) {
                System.out.println("The integer on the " + i + " position is greater than the 11th integer.");
            } else if (array[i] == array[10]) {
                System.out.println("The integer on the " + i + " position is equal as the 11th integer.");
            } else {
                System.out.println("The integer on the " + i + " position is smaller than the 11th integer.");
            }
        }
    }
}
