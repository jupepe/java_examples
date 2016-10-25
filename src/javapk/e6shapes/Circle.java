package javapk.e6shapes;

/**
 *
 * @author Juha Peltomäki
 */
public class Circle extends Shape implements java.io.Serializable {

    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getPintaala() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getKaarenPituus() {
        return 2 * Math.PI + getRadius();
    }

    public String toString() {
        return getName() + ", PI*" + getRadius() + "^2=" + getPintaala();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}