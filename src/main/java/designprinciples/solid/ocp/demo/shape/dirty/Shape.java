package designprinciples.solid.ocp.demo.shape.dirty;

public abstract class Shape {

    private ShapeType shapeType;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }
}
