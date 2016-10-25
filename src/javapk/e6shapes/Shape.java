package javapk.e6shapes;

/**
 * @author Juha Peltomäki
 *
 * Luokkahierarkia esimerkki:  *
 * Shape -luokkahierarkia. Abstraktista Shape -luokasta peritty kaksi
 * konkreettista luokkaa: Circle ja Rectangle.
 *
 */
public abstract class Shape implements java.io.Serializable {

    private String name; // kuvion nimi

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPintaala();

    public abstract double getKaarenPituus();

    public void setName(String name) {
        this.name = name;
    }
}
