package javapk.e8io;

import java.io.Serializable;

/* @author Juha Peltomäki 
 Henkilo-luokka toteuttaa Serializable-rajapinnan
 */
public class Henkilo implements Serializable {

    private String nimi;
    private int ika;

    public Henkilo(String n, int i) {
        setNimi(n);
        setIka(i);
    }

    void setNimi(String n) {
        nimi = n;
    }

    void setIka(int i) {
        ika = i;
    }

    String getNimi() {
        return nimi;
    }

    int getIka() {
        return ika;
    }
}
