
package javapk.e6shapes;

public class ShapesTest {
    public static void main(String args[]) {
        Shapes shapeList = new Shapes();
        shapeList.setShape(new Circle(4));
        shapeList.setShape(new Circle(8));
        for (Shape sh: shapeList.getShapes()) {
            System.out.println("Pinta-ala " + sh.getName() + ": " + sh.getPintaala());
            if (sh.getClass().getName().equals("shapes.Circle")) {
                System.out.println("... Circle-olio - säde:" + ((Circle)sh).getRadius());
            }
            else if(sh.getClass().getName().equals("shapes.Rectangle")) {
                System.out.println("... Rectangle-olio - X, Y:" + ((Rectangle)sh).getX() + "," + ((Rectangle)sh).getY());
            }
        }
    }

}
