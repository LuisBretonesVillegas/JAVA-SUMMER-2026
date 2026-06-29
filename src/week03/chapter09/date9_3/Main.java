/* 1 star
Write a program that creates a Date object, sets its elapsed
time to 10000 , 100000 , 1000000 , 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively.
 */
package week03.chapter09.date9_3;

import java.util.Date;

public class Main {
    static void main(String[] args) {
        Date date = new Date();
        long elapsedTime = 10000;
        for (int i = 0; i < 8; i++) {
            date.setTime(elapsedTime);
            elapsedTime = elapsedTime * 10;
            System.out.println(date.toString());
        }
    }
}
