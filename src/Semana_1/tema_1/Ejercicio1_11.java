package Semana_1.tema_1;

public class Ejercicio1_11 {
    public static void main(String[] args) {

        double year = 365 * 24 * 60 * 60; //year in seconds
        double birthPerYear = year / 7;
        double deathPerYear = year / 13;
        double newImmigrantPerYear = year / 45;
        int currentPopulation = 312032486;

        int year1 = (int) (currentPopulation + birthPerYear + newImmigrantPerYear - deathPerYear);
        int year2 = (int) (year1 + birthPerYear + newImmigrantPerYear - deathPerYear);
        int year3 = (int) (year2 + birthPerYear + newImmigrantPerYear - deathPerYear);
        int year4 = (int) (year3 + birthPerYear + newImmigrantPerYear - deathPerYear);
        int year5 = (int) (year4 + birthPerYear + newImmigrantPerYear - deathPerYear);

        System.out.println("The population in the year 1 is: " + year1);
        System.out.println("The population in the year 2 is: " + year2);
        System.out.println("The population in the year 3 is: " + year3);
        System.out.println("The population in the year 4 is: " + year4);
        System.out.println("The population in the year 5 is: " + year5);
/* Esto se puede resolver con un bucle tambien (Solución de gémini):
package Semana_1.tema_1;

public class Ejercicio1_11 {
    public static void main(String[] args) {

        double secondsInYear = 365.0 * 24 * 60 * 60;
        double netGrowthPerYear = (secondsInYear / 7.0) + (secondsInYear / 45.0) - (secondsInYear / 13.0);
        double population = 312032486;

        for (int year = 1; year <= 5; year++) {
            population += netGrowthPerYear;
            System.out.println("The population in the year " + year + " is: " + (int) population);
        }
    }
}
 */
    }
}
