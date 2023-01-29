package designprinciples.solid.ocp.demo.shape.dirty;

import java.util.List;

public class AreaCalculator {

    public void calculateTotalArea(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            if (shape.getShapeType() == ShapeType.SQUARE) {
                area += calculateSquareArea((Square) shape);
            } else if (shape.getShapeType() == ShapeType.CIRCLE) {
                area += calculateCircleArea((Circle) shape);
            }
        }
        System.out.println("total area = " + area);
    }

    public double calculateSquareArea(Square square)
    {
        return square.getLength() * square.getLength();
    }

    public double calculateCircleArea(Circle circle)
    {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}
