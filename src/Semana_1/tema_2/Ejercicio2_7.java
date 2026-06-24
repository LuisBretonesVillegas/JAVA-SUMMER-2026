package Semana_1.tema_2;

import java.util.*;

public class Ejercicio2_7 {
    static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = (totalMilliseconds / 1000);
        int currentSecond = (int) totalSeconds % 60;
        int totalMinutes = (int) totalSeconds / 60;
        int currentMinute = totalMinutes % 60;
        int totalHours = totalMinutes / 60;
        int currentHour = totalHours % 24;
        System.out.println("The current time is: " + (currentHour + 2) + " hours " + currentMinute + " minutes " + currentSecond + " seconds.");
    }
}
