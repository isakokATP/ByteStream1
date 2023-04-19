package ByteStream;

public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator redCircle = new RedShapeDecorator (circle);
        RedShapeDecorator redRectangle = new RedShapeDecorator (rectangle);
        redCircle.draw();
        redRectangle.draw();
    }
}
