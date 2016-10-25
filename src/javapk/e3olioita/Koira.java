package javapk.e3olioita;

/*
 @author  Juha Peltomäki
 Aihe:     Koira-luokka.
 // metodit (luokan funktio)
 // public avainsana ==> metodi näkyy luokan
 // ulkopuolelle.

 */

class Koira {

    private String hauAani = "Hau Hau Hau Hau!";
    private String murAani = "Murrrrrrrrrrrrrrghgrr!";

    public void asetaAani(String uusi) {
        murAani = uusi;
    }

    public void hauku() {
        System.out.println(hauAani);
    }

    public void murise() {
        System.out.println(murAani);
    }

    public static void main(String args[]) {
        Koira hessu = new Koira();
        hessu.murise();
        hessu.hauku();

        Koira ressu = new Koira();
        ressu.asetaAani("RRRRRRRRR");
        ressu.murise();

    }
}
