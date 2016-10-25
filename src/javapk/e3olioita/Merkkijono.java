package javapk.e3olioita;

/*
 @author  Juha Peltomäki
 Aihe:     Merkkijonon käsittely.
 */
class Merkkijono {

    public static void main(String args[]) {
        // Luodaan String-luokan olio mj2.
        String mj2 = "  Java-ohjelmointi on hawskaa.   ";
        mj2 = mj2.trim(); // Poistetaan tyhjät alusta ja lopusta.
        mj2 = mj2.replace('w', 'u'); // Korvataan w-merkki u:lla
        System.out.println("mj2:" + mj2 + " ja sen pituus on " + mj2.length());

        System.out.println("Merkkijonojen vertailua");
        // Merkkijonon hakeminen String-oliosta */
        int ind = mj2.indexOf("hauska");
        // Jos merkkijono läytyi, (ind = -1, jos ei läytynyt)
        if (ind > 0) {
            System.out.println("Hauska alkaa indeksistä: " + ind);
            String osa_jono = mj2.substring(ind, ind + "hauska".length());
            System.out.println("irroitettu merkkijono: " + osa_jono);
        }
        System.out.println("Muuunnoksen jälkeen: " + mj2.toUpperCase());


        String kieli = "Java";
        if (kieli.toLowerCase().equals("java")) {
            System.out.println(kieli + " == " + "java");
        } else {
            System.out.println(kieli + " != " + "java");
        }


    }
}
