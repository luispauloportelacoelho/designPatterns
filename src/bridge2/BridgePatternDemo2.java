package bridge2;

public class BridgePatternDemo2 {
    public static void main(String[] args) {
        Shape shape = new Triangle(new RedColor());
        Shape shape1 = new Pentagon(new RedColor());
        Shape shape2 = new Pentagon(new GreenColor());
        Shape shape3 = new Pentagon(new BlueColor());

        shape.draw();
        System.out.println("\n");
        shape1.draw();
        System.out.println("\n");
        shape2.draw();
        System.out.println("\n");
        shape3.draw();
    }
}
