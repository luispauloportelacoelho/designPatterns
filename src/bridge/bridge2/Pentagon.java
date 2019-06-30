package bridge.bridge2;

public class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("The pentagon color:");
        color.applyColor();
    }
}
