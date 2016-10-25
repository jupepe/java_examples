package javapk.e6olio_ed;

class Henkilo {

    private String nimi;
    private int ika = -1;

    public Henkilo() {
    }

    public Henkilo(String n, int i) {
        nimi = n;
        ika = i;
    }

    @Override
    public String toString() {
        return nimi + ", " + ika;
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

class Oppilas extends Henkilo {

    private int arvosana = -1;

    public Oppilas() {
        super();  // kutsuu yläluokan konstruktoria: Henkilo()
    }

    public Oppilas(String n, int i, int a) {
        super(n, i); // kutsuu yläluokan konstruktoria: Henkilo(n, i)
        arvosana = a;

    }

    public String toString() {
        String mj = super.toString() + ", " + arvosana;
        return mj;
    }

    public void setArvosana(int a) {
        arvosana = a;
    }

    public int getArvosana() {
        return arvosana;
    }
}

public class OppilasPerittyTesti {

    public static void main(String args[]) {
        Oppilas h1 = new Oppilas("Jack", 27, 3);
        Oppilas h2 = new Oppilas();
        h2.setNimi("John");
        h2.setIka(22);
        h2.setArvosana(2);
        Oppilas h3 = new Oppilas("Jill", 31, 4);
        Oppilas h4 = new Oppilas("Johnny", 21, 1);
        //System.out.println(h1);     System.out.println(h2);
        //System.out.println(h3);     System.out.println(h4);
        // LISÄTEHTÄVÄ.
        // Tallenna luodut Oppilas-oliot valitsemaasi Oliotaulukkoon (Oppilas[])
        Oppilas[] oppilaat = new Oppilas[5];
        oppilaat[0] = h1;
        oppilaat[1] = h2;
        oppilaat[2] = h3;
        oppilaat[3] = h4;
        for (int i = 0; i < oppilaat.length; i++) {
            if (oppilaat[i] != null) {
                System.out.println(oppilaat[i]);
            }
        }
        for (Oppilas opp : oppilaat) {
            System.out.println(opp);
        }
    }
}
