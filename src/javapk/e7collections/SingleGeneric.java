package javapk.e7collections;

/**
 * Esimerkki: Geneeriset tietotyypit Ominaisuus tuli kieleen JDK 1.5:ssa, joten
 * kaikki Java-ohjelmat eivät käytä Geneerisiä tyyppejä hyväkseen. Kuitenkin
 * esimerkiksi Collection-kokoelmaluokkien kanssa ominaisuus on erittäin
 * tarpeellinen. * Geneerisissä tyypeissä voidaan varsinainen tietotyyppi
 * määritellä parametrinä eli ns. parametrisoituna tyyppinä,
 * GeneerinenPerusluokka<String> g1 = new GeneerinenPerusluokka<String>( );
 * Toimii g1.setArvo("uuno"); * Jos tämän jälkeen yritetään lisätä kokoelmaan
 * väärän tyyppinen olion, tulee virhe: g1.setArvo(new Integer(5)); // <==
 * Kääntäjän virhe.
 *
 * Alla esimerkki virheilmoituksesta: setArvo(java.lang.String) in
 * GeneerinenPerusluokka<java.lang.String> cannot be applied to
 * (java.lang.Integer) g1.setArvo(new Integer(5));	*
 */
/**
 * *
 */
import java.util.*;

class GeneerinenPerusluokka<Type> {

    private Type arvo = null;

    public Type getArvo() {
        return this.arvo;
    }

    public void setArvo(Type arvo) {
        this.arvo = arvo;
    }

    public String toString() {
        return arvo.toString();
    }
}

public class SingleGeneric {

    public static void main(String args[]) {
        GeneerinenPerusluokka<String> g1 =
                new GeneerinenPerusluokka<>();
        g1.setArvo("uuno");
        //g1.setArvo(new Integer(5));   
        System.out.println(g1);


        // Voidaan lisätä myäs kokoelma listaan.
        ArrayList<String> list = new ArrayList<>();
        list.add("yksi");
        list.add("kaksi");
        list.add("kolme"); list.add("neljä");
        GeneerinenPerusluokka<ArrayList<String>> g3 = new GeneerinenPerusluokka<>();
        g3.setArvo(list);
        System.out.println(g3);

    }
}
