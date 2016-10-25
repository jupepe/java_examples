package javapk.e3olioita;

/*
 @author  Juha Peltomäki   

 Ajoneuvo-luokka
 attribuutit: paino, nopeus ja nimi
 metodit: aseta_paino(), palauta_paino(), aseta_nopeus(), palauta_nopeus()
 */
class Ajoneuvo {

    int paino;
    int nopeus;
    String nimi;

    Ajoneuvo() {
        this.paino = 0;
        this.nopeus = 0;
    }

    Ajoneuvo(String uusi_nimi) {
        this.paino = 0;
        this.nopeus = 0;
        this.nimi = uusi_nimi;
    }

    public void aseta_paino(int uusi_paino) {
        this.paino = uusi_paino;
    }

    public int palauta_paino() {
        return this.paino;
    }

    public void aseta_nopeus(int uusi_nopeus) {
        this.nopeus = uusi_nopeus;
    }

    public int palauta_nopeus() {
        return this.nopeus;
    }

    public String palauta_nimi() {
        return this.nimi;
    }

    public String toString() {
        return "[nimi = " + nimi + ", maksiminopeus = " + nopeus + ", paino = " + paino + "]" + " Luokka: " + this.getClass().getName();
    }
}

/**
 * MaaAjoneuvo peritään Ajoneuvo-luokasta.
 */
class MaaAjoneuvo extends Ajoneuvo {

    int renkaita;

    MaaAjoneuvo() {
        this.paino = 0;
        this.nopeus = 0;
        this.renkaita = 0;
    }

    public MaaAjoneuvo(String nimi, int renkaita) {
        this.paino = 0;
        this.nopeus = 0;
        this.nimi = nimi;
        this.renkaita = renkaita;

    }

    public void aseta_renkaat(int renkaita) {
        this.renkaita = renkaita;
    }

    public int palauta_renkaiden_lkm() {
        return renkaita;
    }
}

/**
 * Moottoripyärä peritään Maa-ajoneuvo-luokasta. Ainoastaan alustaja
 * määritellään uudestaan.
 */
class Moottoripyora extends MaaAjoneuvo {

    Moottoripyora(int paino, int nopeus, String nimi, int renkaita) {
        this.paino = paino;
        this.nopeus = nopeus;
        this.nimi = nimi;
        aseta_renkaat(renkaita);
    }
}

/**
 * Auto peritään Maa-ajoneuvoluokasta. Ainoastaan alustaja määritellään
 * uudestaan.
 */
class Auto extends MaaAjoneuvo {

    Auto(int paino, int nopeus, String nimi, int renkaita) {
        this.paino = paino;
        this.nopeus = nopeus;
        this.nimi = nimi;
        aseta_renkaat(renkaita);
    }
}

public class PeritytAjoneuvot {

    public static void main(String args[]) {
        String tulos_mj;
        Ajoneuvo tojota, jamaha;

        // Lisätään listaan ensimmäinen ajoneuvo
        tojota = new Auto(1000, 200, "Toyota", 4);

        System.out.println(tojota);

        // Lisätään listaan toinen ajoneuvo
        jamaha = new Moottoripyora(300, 220, "Yamaha", 2);

        System.out.println(jamaha);

    }
}