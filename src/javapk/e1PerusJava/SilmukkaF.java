package javapk.e1PerusJava;

/**
 *
 * @author Juha Peltomaki
 */
public class SilmukkaF {

    // 1. Summan laskeminen 
    public static int summa(int alku, int loppu) {
        int summa = 0;
        for (int i = alku; i < loppu; i++) {
            summa += i;
        }
        return summa;
    }

    // 2. tulon laskeminen 
    public static int tulo(int alku, int loppu) {

        // 2. Tulon laskeminen
        int tulo = 1;
        int i = alku;

        while (i < loppu) {
            tulo *= i;
            i++;
        }
        return tulo;
    }

    public static void main(String args[]) {

        int summa = summa(1, 20);
        int tulo = tulo(1, 20);

        System.out.println("Summa 1-20 = " + summa);
        System.out.println("tulo 1-20 = " + tulo);


    }
}
