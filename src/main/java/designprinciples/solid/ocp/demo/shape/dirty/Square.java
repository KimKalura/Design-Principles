package designprinciples.solid.ocp.demo.shape.dirty;

public class Square extends Shape {

    private final double length;

    public Square(double length, ShapeType shapeType) {
        super(shapeType);
        this.length = length;
    }

    public double getLength() {
        return length;
    }


}
