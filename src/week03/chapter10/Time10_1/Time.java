/*
Design a class named Time. The class contains:
■■ The data fields hour, minute, and second that represent a time.
■■ A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
■■ A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
■■ A constructor that constructs a Time object with the specified hour, minute,
and second.
■■ Three getter methods for the data fields hour, minute, and second,
respectively.
■■ A method named setTime(long elapseTime) that sets a new time for the
object using the elapsed time. For example, if the elapsed time is 555550000
milliseconds, the hour is 10, the minute is 19, and the second is 10.
 */
package week03.chapter10.Time10_1;

public class Time {

    private int hour, minute, second;

    public Time() {
        this(System.currentTimeMillis()); //this needs to be to save the data
    }

    public Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int) (totalHours % 24);
        System.out.println("The current time is: " + hour + " hours " + minute + " minutes " + second + " seconds.");
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int) (totalHours % 24);
    }

}
