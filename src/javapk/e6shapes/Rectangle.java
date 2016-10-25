package javapk.e6shapes;

/**
 *
 * @author Juha Peltomäki
 */
public class Rectangle extends Shape implements java.io.Serializable {

    private int x, y;

    public Rectangle(int x, int y) {
        super("Rectangle");
        this.x = x;
        this.y = y;
    }

    public double getPintaala() {
        return getX() * getY();
    }

    public double getKaarenPituus() {
        return 2 * getX() + 2 * getY();
    }

    public String toString() {
        return getName() + ", " + getX() + "*" + getY() + "=" + getPintaala();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
