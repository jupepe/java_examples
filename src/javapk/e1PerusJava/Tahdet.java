package javapk.e1PerusJava;

/*
 Ohjelma tulostaa komentoriviparametrina annettu määrän tähtiä.
 Käytetään for- ja while- silmukoita
   
 */
class Tahdet {

    public static void main(String argv[]) {
        int i, luku;
        luku = Integer.parseInt(argv[0]);
        System.out.println("Tulostetaan " + luku + " t�hte�");
        System.out.println("While-silmukka: ");
        i = 0;
        while (i < luku) {
            System.out.print("*");
            i++;
        }

        System.out.println("\nDo/While-silmukka: ");
        i = 0;
        do {
            System.out.print("*");
            i++;
        } while (i < luku);

        System.out.println("\nFor-silmukka: ");
        for (i = 0; i < luku; i++) {
            System.out.print("*");
        }

    }
}