package week01.chapter02;

//If today is Tuesday, what will be the day in 100 days?
public class EjercicioDiasSemana {
    static void main(String[] args) {
        int resto = 100 % 7;
        switch (resto) {
            case 1:
                System.out.println("Es miercoles.");
                break;
            case 2:
                System.out.println("Es jueves.");
                break;
            case 3:
                System.out.println("Es viernes.");
                break;
            case 4:
                System.out.println("Es sabado.");
                break;
            case 5:
                System.out.println("Es domingo.");
                break;
            case 6:
                System.out.println("Es lunes.");
                break;
            case 7:
                System.out.println("Es martes.");
                break;
        }
    }
}
