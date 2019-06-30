package bridge.bridge2;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("The square color:");
        color.applyColor();
    }
}
