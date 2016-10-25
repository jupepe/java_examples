package javapk.e1PerusJava;

/* 
 mallivastaus:
 Kertotau.java

 Ohjelma tulostaa 10-kertotaulun 
 */
class KertotauluFunktiot {
    // Vakioilla rajat kertotaululle

    static final int ALARAJA = 1, YLARAJA = 12;

    public static void main(String argv[]) {
        int i = 0, k = 0;
        for (i = ALARAJA; i <= YLARAJA; i++) {
            int tmp = 0;
            for (k = ALARAJA; k <= YLARAJA; k++) {
                tmp = k * i;
                System.out.print(tmp + " ");
            }
            System.out.println();
        }

    }
}
