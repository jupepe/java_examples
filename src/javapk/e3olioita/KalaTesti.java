package javapk.e3olioita;

/* 
 @author  Juha Peltomäki 
 Olio-ohjelmointiesimerkki
 * Olennaista, että tehdään omia tietotyyppejä (class, luokkia)
 * Nämä tietotyypit osaavat hallita oman sisäisen tietonsa
 */
class Kala {

    private String lajike;  // Yleensä luokan ominaisuudet suojataan Private-määreellä
    private String nimi;
    private double paino;
    private double pituus;

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

    public String toString() {
        return "[" + nimi + " " + lajike + ", " + paino + " g, " + pituus + " cm.]";
    }
}

public class KalaTesti {

    public static void main(String args[]) {
        Kala hauki = new Kala();
        //hauki.nimi = "Hannu";
        //hauki.lajike = "Hauki";
        hauki.asetaLajike("Hauki");
        hauki.asetaNimi("Hannu");
        hauki.asetaPaino(1500);  // TEHTÄVÄ! toteuta nämä!
        hauki.asetaPituus(36);
        System.out.println(hauki);
        // TEHTÄVÄ! Luodaan toinen kala ja tulostetaan kalan tiedot!
        Kala ruutana = new Kala();
        ruutana.asetaLajike("Ruutana");
        ruutana.asetaNimi("Rami");
        ruutana.asetaPaino(650);
        ruutana.asetaPituus(25);
        //System.out.println(ruutana);

        // Lisätehtävä! Mieti, miten tallentaiset yksittäiset Kala-oliot Taulukkoon?
        // Voi myös toteuttaa...
        Kala[] kalat = new Kala[3];
        kalat[0] = hauki;
        kalat[0].asetaNimi("UusiHauki");
        kalat[1] = ruutana;
        kalat[2] = new Kala();  // Varaa muistia ja suorittaa muuttujien alustukset
        kalat[2].asetaLajike("Silakka");
        kalat[2].asetaNimi("Simo");
        for (int i = 0; i < kalat.length; i++) {
            System.out.println(kalat[i]);
        }

    }
}
