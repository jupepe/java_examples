package javapk.e2Taulukko;

/**
 *
 * @author Juha Peltomäki
 */
public class TaulukonTulostus {

    public static void main(String args[]) {
        int luvut[] = new int[]{10, 12, 7, 8, 15, 21, 22, 12, 3};
        // Tulostetaan luvut -taulukon sisältöä yksi kerrallaan
        System.out.println(luvut[0] + "," + luvut[1] + "," + luvut[2]);
        // tai koko taulukko kerralla for-silmukalla
        for (int i = 0; i < 7; i++) {
            System.out.print(luvut[i] + ", ");
        }
        System.out.println();
        // Tulostetaan taulukko käyttäen taulukon pituutta (length)
        for (int i = 0; i < luvut.length; i++) {
            System.out.print(luvut[i] + ", ");
            // for, vaihtoehtona while, do/while, mutta käytetään harvemmin
            for (int k = 0; k < luvut[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
