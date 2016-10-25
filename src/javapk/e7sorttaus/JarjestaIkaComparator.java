package javapk.e7sorttaus;

import java.util.*;

/**
 *
 * @author Juha Peltomaki Javan järjestelyesimerkki. Esimerkki käyttää javan
 * Comparator-rajapintaa, joka annataan sort()-metodille parametrinä.
 * Comparator-rajapinta toteutetaan erillisessä luokassa eli sen voi tehdä
 * helposti jälkikäteen muuttamatta alkuperäistä luokkarakennetta.
 */
public class JarjestaIkaComparator {

    public JarjestaIkaComparator() {
    }

    public static void main(String args[]) {
        Yhteystieto[] kaverit = new Yhteystieto[8];
        kaverit[0] = new Yhteystieto("Roope", "Ankka", "050-54321", 50);
        kaverit[1] = new Yhteystieto("Taavi", "Ankka", "050-54321", 50);
        kaverit[2] = new Yhteystieto("Kake", "Ykkänen", "050-645645", 46);
        kaverit[3] = new Yhteystieto("Aku", "Ankka", "050-12434", 50);
        kaverit[4] = new Yhteystieto("Tupu", "Ankka", "050-98765", 13);
        kaverit[5] = new Yhteystieto("Hupu", "Ankka", "050-12345", 13);
        kaverit[6] = new Yhteystieto("Lupu", "Ankka", "050-76543", 13);
        kaverit[7] = new Yhteystieto("Uuno", "Ykkänen", "050-12341", 18);

        java.util.Arrays.sort(kaverit, new IkaComparator());
        for (Yhteystieto y : kaverit) {
            System.out.println(y);
        }
    }
}

class Yhteystieto {

    public String etu, suku, nro;
    public int ika;

    public Yhteystieto(String etu, String suku, String nro, int ika) {
        this.etu = etu;
        this.suku = suku;
        this.nro = nro;
        this.ika = ika;
    }

    public String toString() {
        return suku + ", " + etu + "\t" + ika;
    }
}

/* Esimerkissä käytetään erillista luokkaa ja Comparator-rajapintaa.
 Järjestelyavaimia ovat järjestyksessä:
 1. ikä
 2. sukunimi
 3. etunimi
 */
class IkaComparator implements Comparator<Yhteystieto> {
    /* compare() metodi pal. käänteisen järjestyksen */
    // Hoidetaan kahden alkion välinen järjestys kuntoon. Numeerinen järjestys
    // <0 => ensimmäinen on pienempi (nuorempi tai ennen aakkosjärjestyksessä)
    // =0 => samat 
    // >0 => ensimmäinen on suurempi (vanhempi tai jälkeen aakkosjärjestyksessä)

    public int compare(Yhteystieto a, Yhteystieto b) {
        int ikaVert = a.ika - b.ika;
        if (ikaVert == 0) {
            if (a.suku.equals(b.suku)) // sukunimet samoja
            {
                return a.etu.compareTo(b.etu);
            } else {
                return a.suku.compareTo(b.suku);
            }
        }
        return ikaVert;
    }
}