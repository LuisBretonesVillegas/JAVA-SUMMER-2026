/*
Write a
test program that creates three Time objects (using new Time(), new
Time(555550000), and new Time(5, 23, 55)) and displays their hour,
minute, and second in the format hour:minute:second
 */
package week03.chapter10.Time10_1;

public class Main {
    static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time(555550000);
        Time t3 = new Time(5, 23, 55);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
