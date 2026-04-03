//Never needs to change for different shapes
package ocp;
import java.util.List;
public class AreaCalculator {
    public double total(List<Shape> shapes) { return shapes.stream().mapToDouble(Shape::area).sum(); }
}
