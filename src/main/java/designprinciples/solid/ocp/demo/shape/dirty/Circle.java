package designprinciples.solid.ocp.demo.shape.dirty;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, ShapeType shapeType) {
        super(shapeType);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
