package javapk.e5oppilas;

public class Henkilo implements java.io.Serializable{

    private String nimi;
    private int ika = -1;

    /* Luokan alustajat */
    public Henkilo() {
    }

    public Henkilo(String n, int i) {
        nimi = n;
        ika = i;
    }

    public String toString() {
        String mj = nimi + ", " + ika;
        return mj;
    }

// Getterit ja Setterit
    public void setNimi(String n) {
        nimi = n;
    }

    public void setIka(int i) {
        ika = i;
    }

    public int getIka() {
        return ika;
    }

    public String getNimi() {
        return nimi;
    }
}
