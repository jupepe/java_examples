package javapk.e8io;

/*
 * Esimerkki:  
 *   * Dynaaminen taulukko (ArrayList)
 * IO-toiminnot: 
 * luku/kirjoittaminen
 * ObjectInputStream and ObjectOutputStream (Java serialisointi)
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Kala implements Serializable {

    private String lajike;  // Yleensä luokan ominaisuudet suojataan Private-määreellä
    private String nimi;
    private double paino;
    private double pituus;

    public Kala(String lajike, String nimi, double paino, double pituus) {
        this.lajike = lajike;
        this.nimi = nimi;
        this.paino = paino;
        this.pituus = pituus;
    }

    public void asetaLajike(String n) {
        lajike = n;
    }

    public void asetaNimi(String n) {
        nimi = n;
    }

    public void asetaPaino(double paino) {
        // Voi lisätä tarkastuksia, esim. paino > 0, muuten asetetaan nollaksi tai negatiiviseksi
        this.paino = paino; //
    }

    public void asetaPituus(double p) {
        pituus = p;
    }

    @Override
    public String toString() {
        return "[" + nimi + " " + lajike + ", " + paino + " g, " + pituus + " cm.]";
    }

    public double palautaPaino() {
        return paino;
    }
}

class JarjestaKalat implements Comparator<Kala> {

    @Override
    public int compare(Kala k1, Kala k2) {
        if (k1.palautaPaino() > k2.palautaPaino()) {
            return -1;
        }
        if (k2.palautaPaino() < k1.palautaPaino()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class KalalistaTesti {

    public static void main(String args[]) {
        ArrayList<Kala> kalat = new ArrayList<Kala>();
        kalat.add(new Kala("hauki", "hannu", 4500, 85));
        kalat.add(new Kala("taimen", "timo", 3600, 60));
        kalat.add(new Kala("lohi", "lasse", 11500, 110));
        kalat.add(new Kala("ahven", "antti", 800, 35));
        kalat.add(new Kala("made", "mauri", 1700, 60));
        kalat.add(new Kala("kuha", "kauno", 3400, 70));
        for (Kala k : kalat) {
            System.out.println(k);
        }
        // Tallennus tiedostoon
        ObjectOutputStream output;
        try {
            output = new ObjectOutputStream(
                    new FileOutputStream("kalatiedot.data"));
            output.writeObject(kalat);
            output.close();

        } catch (IOException ex) {
            System.out.println("Virhe tiedostoon kirjoittamisessa" + ex);
        }
        // Lukeminen tiedostosta
        ObjectInputStream input;
        ArrayList<Kala> uudetKalat = null;
        try {
            input = new ObjectInputStream(
                    new FileInputStream("kalatiedot.data"));
            uudetKalat = (ArrayList<Kala>) input.readObject();
            input.close();
        } catch (IOException ex) {
            System.out.println("Virhe tiedoston lukemisessa" + ex);
        } catch (ClassNotFoundException e) {
        }
        System.out.println("Kalalista luettu tiedostosta.");
        for (Kala k : uudetKalat) {
            System.out.println(k);
        }


        // Kalojen järjestäminen (sort)
        System.out.println("Kalalista järjestetty.");

        Collections.sort(uudetKalat, new JarjestaKalat());
        for (Kala k : uudetKalat) {
            System.out.println(k);
        }



    }
}
