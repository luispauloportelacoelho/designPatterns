package template.template2;

public abstract class House {
    abstract void buildPillars();
    abstract void buildWalls();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    public final void build() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("The house is built.");
    }
}
