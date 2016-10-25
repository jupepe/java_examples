package javapk.e7sorttaus;


/**
 *
 * @author Juha Peltomäki
 */
public class JarjestaIka {
    
    public JarjestaIka() {
    }
    
    public static void main(String args[]) {
        Yhteystieto3[] kaverit = new Yhteystieto3[7];
        kaverit[0] = new Yhteystieto3("Aku", "Ankka", "050-12434", 50);
        kaverit[1] = new Yhteystieto3("Taavi", "Ankka", "050-54321", 36);
        kaverit[2] = new Yhteystieto3("Kake", "Ykkänen", "050-645645", 46);
        kaverit[3] = new Yhteystieto3("Roope", "Ankka", "050-54321", 55);
        kaverit[4] = new Yhteystieto3("Hupu", "Ankka", "050-12345", 13);
        kaverit[5] = new Yhteystieto3("Lupu", "Ankka", "050-76543", 13);
        kaverit[6] = new Yhteystieto3("Uuno", "Ykkänen", "050-12341", 18);
        
        java.util.Arrays.sort(kaverit);
        for (Yhteystieto3 y : kaverit) { System.out.println(y); }
    }
}

class Yhteystieto3 implements Comparable {
    private String etu, suku, nro; 
    private int ika;
    public Yhteystieto3(String etu, String suku, String nro, int ika) {
        this.etu = etu;         this.suku = suku;         this.nro = nro; this.ika = ika;
    }
    @Override
    public String toString() {
        return suku + ", " + etu + "\t" + ika;
    }
    // Hoidetaan kahden alkion välinen järjestys kuntoon. Numeerinen järjestys
    // <0 => ensimmäinen on pienempi (nuorempi)
    // =0 => samat 
    // >0 => ensimmäinen on suurempi (vanhempi)
    @Override
    public int compareTo(Object verr) {
        return this.ika - ((Yhteystieto3)verr).ika;
    }
}
