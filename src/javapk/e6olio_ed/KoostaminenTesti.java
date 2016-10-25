/*
 * @author Juha Peltomäki
 * Koostaminen olemassa olevista luokista
 * Auto-luokka, jossa mukana oliot Rengas-luokasta sekä Moottori-luokasta.
 */
package javapk.e6olio_ed;

/**
 * * @author Juha Peltomäki
 */
class Rengas {

    private String koko;

    public String getKoko() {
        return koko;
    }

    public void setKoko(String koko) {
        this.koko = koko;
    }

    public String toString() {
        return koko + "";
    }
}

class Moottori {

    private int teho;
    private int iskutilavuus;

    public int getTeho() {
        return teho;
    }

    public void setTeho(int teho) {
        this.teho = teho;
    }

    public int getIskutilavuus() {
        return iskutilavuus;
    }

    public void setIskutilavuus(int iskutilavuus) {
        this.iskutilavuus = iskutilavuus;
    }

    public String toString() {
        return teho + " hv, " + iskutilavuus + " cm^3";
    }
}
/* Esimerkissä luokka Auto koostetaan olemassa olevien luokkien avulla!
 * Moottori ja Rengas-oliot käytössä Auto-luokassa.
 */

class Auto {

    private String merkki;
    private String malli;
    private Moottori moottori;
    private Rengas[] renkaat;

    public Auto() {
        renkaat = new Rengas[4];  // luodaan oliotaulu renkaat[]
        for (int i = 0; i < renkaat.length; i++) {
            renkaat[i] = new Rengas();
        }
        moottori = new Moottori(); // luodaan moottori-olio, asetaTiedot()-metodissa tiedot kohdalleen
    }

    public void asetaTiedot(String merkki, String malli, int teho, int til, String koko) {
        this.merkki = merkki;
        this.malli = malli;
        this.moottori.setIskutilavuus(til);
        this.moottori.setTeho(teho);

        for (int i = 0; i < renkaat.length; i++) {
            renkaat[i].setKoko(koko);
        }
    }

    public String toString() {
        return "[" + merkki + " " + malli + ", " + moottori + ", 4:" + renkaat[0] + "]";
    }
}

public class KoostaminenTesti {

    public static void main(String args[]) {
        Auto corolla = new Auto();
        corolla.asetaTiedot("Toyota", "Corolla", 99, 1329, "205/55 R16");
        Auto octavia = new Auto();
        octavia.asetaTiedot("Skoda", "Octavia", 160, 1798, "195/65 R15");

        System.out.println(corolla + "\n" + octavia);

    }
}
