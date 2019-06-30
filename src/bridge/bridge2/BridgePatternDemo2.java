package bridge.bridge2;

public class BridgePatternDemo2 {
    public static void main(String[] args) {
        Shape shape = new Triangle(new RedColor());
        Shape shape1 = new Pentagon(new RedColor());
        Shape shape2 = new Pentagon(new GreenColor());
        Shape shape3 = new Pentagon(new BlueColor());
        Shape shape4 = new Square(new RedColor());

        shape.draw();
        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();

    }
}
