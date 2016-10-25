package javapk.e2Taulukko;

class Kertotaulu {

    static final int ALA = 3, YLA = 10;
    static final int[][] ktaulu = new int[YLA + 1][YLA + 1];

    public static void main(String argv[]) {
        int i = 0, k = 0;

        for (i = ALA; i <= YLA; i++) {
            for (k = ALA; k <= YLA; k++) {
                ktaulu[i][k] = k * i;
            }
        }
        // Tulostus - muotoilematon
        for (i = ALA; i <= YLA; i++) {
            for (k = ALA; k <= YLA; k++) {
                System.out.println(i + "*" + k + "=" + ktaulu[i][k]);
            }
        }
    }
}
