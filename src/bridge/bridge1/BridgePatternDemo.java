package bridge.bridge1;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle(100, 100, 10, new RedCircle());
        Shape shape2 = new Circle(200, 200, 20, new GreenCircle());

        shape1.draw();
        shape2.draw();
    }
}
