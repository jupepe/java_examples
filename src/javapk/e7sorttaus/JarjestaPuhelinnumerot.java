package javapk.e7sorttaus;

// ks. järjestäminen
// http://java.sun.com/docs/books/tutorial/collections/interfaces/order.html
public class JarjestaPuhelinnumerot {

    public static void main(String args[]) {
        Yhteystieto2[] kaverit = new Yhteystieto2[7];
        kaverit[0] = new Yhteystieto2("Aku", "Ankka", "050-12434");
        kaverit[1] = new Yhteystieto2("Taavi", "Ankka", "050-54321");
        kaverit[2] = new Yhteystieto2("Kake", "Ykkänen", "050-645645");
        kaverit[3] = new Yhteystieto2("Roope", "Ankka", "050-54321");
        kaverit[4] = new Yhteystieto2("Hupu", "Ankka", "050-12345");
        kaverit[5] = new Yhteystieto2("Lupu", "Ankka", "050-76543");
        kaverit[6] = new Yhteystieto2("Uuno", "Ykkänen", "050-12341");

        java.util.Arrays.sort(kaverit);
        for (Yhteystieto2 y : kaverit) {
            System.out.println(y);
        }
    } // TEHTäVä:      Järjestä alkiot siten, että ne ovat suku- ja etunimen mukaan järjestyksessä
}// Vinkki: Javasta läytyy String-luokasta compareTo() ja equals() metodit
// LISäTEHTäVä: lisää int-tyyppinen ika-attribuutti ja järjestä henkilät iän mukaan nuorimmasta vanhimpaan.

class Yhteystieto2 implements Comparable {

    private String etu, suku, nro;

    public Yhteystieto2(String etu, String suku, String nro) {
        this.etu = etu;
        this.suku = suku;
        this.nro = nro;
    }

    public String toString() {
        return suku + ", " + etu + "\t" + nro;
    }
    // Hoidetaan kahden peräkkäisen alkion välinen järjestys kuntoon sorttausalgoritmille
    public int compareTo(Object verr) {
        if (suku.equals(((Yhteystieto2) verr).suku)) // jos sukunimet samat verrataan etunimiä 
        {
            return etu.compareTo(((Yhteystieto2) verr).etu);
        } else // muuten verrataan sukunimiä
        {
            return suku.compareTo(((Yhteystieto2) verr).suku);
        }
    }
}
