package ByteStream;

public class RedShapeDecorator extends ShapeDecorator implements Shape{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color: Red");
    }
}
