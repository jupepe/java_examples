package javapk.e6shapes;

import java.util.*;

/**
 *
 * @author Juha Peltomäki
 */
public class Shapes {

    List<Shape> shapes;

    public Shapes() {
        shapes = new ArrayList<Shape>();
        shapes.add(new Circle(6));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(6, 5));
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(3, 6));
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShape(Shape c) {
        shapes.add(c);
    }
}
