package bridge.bridge2;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("The triangle color:");
        color.applyColor();
    }
}
