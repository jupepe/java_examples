package javapk.e1PerusJava;

/**
 *
 * @author Juha Peltomaki Ehtolauseet: Koetulos luetaan komentoriviparametrina
 */
public class Ehto {

    public static void main(String argv[]) {
        double koeTulos = 0;

        try {
            koeTulos = Double.parseDouble(argv[0]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
            System.exit(0);
        } catch (NumberFormatException ae) {
            System.out.println(ae);
            System.exit(0);
        }

        if (koeTulos >= 25) {
            System.out.print("Kiitett�v�");
        } else if (koeTulos >= 20) {
            System.out.print("Hyv�");
        } else if (koeTulos >= 15) {
            System.out.print("Tyydytt�v�");
        } else {
            System.out.print("Hyl�tty");
        }

    }
}