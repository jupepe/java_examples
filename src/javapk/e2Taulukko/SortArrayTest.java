package javapk.e2Taulukko;

// Toteuttaa yksinkertainen valintalajittelun kokonaislukutaulukolle.
public class SortArrayTest {

    /**
     * Taulukon alkioiden sorttaaminen
    *
     */
    public static void main(String[] args) {
        int i;

        int[] data = {1000, 60, 50, 54, 72, 61, 900, 220, 310, 400, 0, -10, -20};
        int[] t = generoiTaulukko(20);


        // Tulostaa alkuperäisen taulukon:
        System.out.println("Alkuperäinen:");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // Järjestää luvut alusta loppuun
        selectionSort(data, 0, data.length);
        System.out.println("Järjestetty:");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /**
     * Metodi järjestää parametrina annettavan datajoukon ja palauttaa
     * järjestetyn taulukon.
     *
     * @param data Järjestettävä taulukko väliltä eka - eka+n
     * @param eka ensimmäisen järjestettävän alkion indeksi
     * @param n Järjestettävän taulukon elementtien lukumaara
     * @exception ArrayIndexOutOfBoundsException
     *
     */
    public static void selectionSort(int[] data, int eka, int n) {
        int i, j; // Silmukka alkiot
        int suurin;  // Suurin indeksi data[eka]...data[eka+i]
        int tmp; // Vaihtaa kaksi taulukon alkiota
        for (i = n - 1; i > 0; i--) {
            suurin = eka;
            for (j = eka + 1; j <= eka + i; j++) {
                if (data[suurin] < data[j]) {
                    suurin = j;
                }
            }

            // vaihto
            tmp = data[eka + i];
            data[eka + i] = data[suurin];
            data[suurin] = tmp;
        }
    }

    public static int[] generoiTaulukko(int n) {
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = (int) (Math.random() * n);
        }
        return t;
    }
}
