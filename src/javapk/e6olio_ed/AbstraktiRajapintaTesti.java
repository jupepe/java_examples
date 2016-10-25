package javapk.e6olio_ed;

/**
 *
 * @author Juha Peltomäki Kurssiesimerkki: Yhdessä esimerkissä kolme asiaa: *
 * rajapinnat (interface) * abstraktit luokat (abstract classes) * tyypinmuunnos
 * (typecast)
 *
 */
interface Pallo {

    public abstract void liiku(int m);

    public abstract void nollaa();
}

class Urheiluvaline {

    private String laji;

    public void setLaji(String l) {
        laji = l;
    }

    public String getLaji() {
        return laji;
    }

    public String toString() {
        return "Urheiluväline.";
    }
}

class Jalkapallo extends Urheiluvaline implements Pallo {

    private int matka;

    public void liiku(int m) {
        matka = this.matka + m;
    }

    public void nollaa() {
        matka = 0;
    }

    public String toString() {
        return getLaji() + " on liikkunut " + matka + " metriä";
    }
}

class Pesapallo extends Urheiluvaline implements Pallo {

    private int matka;

    public void liiku(int m) {
        matka = this.matka + m; // liikuttu aiempi "matka + m" verran
    }

    public void nollaa() {
        matka = 0;
    }

    public String toString() {
        return getLaji() + " on liikkunut " + matka + " metriä";
    }
}
/*
 * TEHTÄVÄ! Toteuta itse Pesapallo-luokka
 * class Pesapallo extends Urheiluvaline implements Pallo
 */

public class AbstraktiRajapintaTesti {

    public static void main(String args[]) {
        Pallo[] pallot = new Pallo[3];
        pallot[0] = new Jalkapallo();
        pallot[0].liiku(5);
        pallot[1] = new Pesapallo();
        pallot[1].liiku(6);
        pallot[2] = new Pesapallo();
        pallot[2].liiku(22);
        // Toinen vaihtoehto on alustaa urheiluväline[] -taulu, mutta tällöin käyttö hieman erilaista
        //pallot[3] = new Urheiluvaline();

        pallot[1].nollaa();
        pallot[1].liiku(7);
        pallot[1].liiku(8);
        pallot[1].liiku(9);
        ((Jalkapallo) pallot[0]).setLaji("Jalis");
        ((Pesapallo) pallot[1]).setLaji("Pesis");
        ((Pesapallo) pallot[2]).setLaji("Pesis");

        for (Pallo pallo : pallot) { // Käy kaikki taulukon pallot[] oliot läpi
            System.out.println(pallo); // automaattisesti kutsuu toString()-metodia
        }
    }
}
