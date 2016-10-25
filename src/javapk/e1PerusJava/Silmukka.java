package javapk.e1PerusJava;

/**
 *
 * @author Juha Peltomaki
 */
public class Silmukka {

    public static void main(String args[]) {

        // 1. Summan laskeminen
        int summa = 0;
        for (int i = 1; i < 10; i++) {
            summa += i;
        }


        // 2. Tulon laskeminen
        int tulo = 1;
        int i = 1;

        while (i < 10) {
            tulo *= i;
            i++;
        }

        System.out.println("Summa 1-10 = " + summa);
        System.out.println("tulo 1-10 = " + tulo);


    }
}
