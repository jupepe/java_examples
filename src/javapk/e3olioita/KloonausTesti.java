package javapk.e3olioita;
/*
 @author  Juha Peltomäki
 Esimerkki:
 Testataan Cloneable-rajapintaa.
 */

class PerusLuokka implements Cloneable {

    int luku = 0;

    PerusLuokka() {
    }

    PerusLuokka(int alkuarvo) {
        luku = alkuarvo;
    }

    public void aseta_arvo(int uusi) {
        luku = uusi;
    }

    public int palauta_arvo() {
        return luku;
    }

    protected Object clone() throws CloneNotSupportedException {
        PerusLuokka p = (PerusLuokka) super.clone();
        return p;
    }
}

public class KloonausTesti {

    public static void main(String args[]) {
        PerusLuokka o1, o2 = new PerusLuokka(), o3;


        o1 = new PerusLuokka(1);
        o1.aseta_arvo(10);
        try {
            // kopioidaan o1:n tiedot o2:een.
            o2 = (PerusLuokka) o1.clone();
        } catch (CloneNotSupportedException p) {
            p.printStackTrace();
        }

        o2.aseta_arvo(20);
        o3 = o1; // nyt o1 ja 03 viittaavat samaan muistipaikkaan.
        o3.aseta_arvo(30);
        o2.aseta_arvo(40);

        System.out.println("o1: " + o1.palauta_arvo() + " " + o1.toString());
        System.out.println("o2: " + o2.palauta_arvo() + " " + o2.toString());
        System.out.println("o3: " + o3.palauta_arvo() + " " + o3.toString());
        // testataan yhtäsuuruutta
    }
}
