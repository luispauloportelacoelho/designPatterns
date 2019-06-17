package template.template2;

public class WoodenHouse extends House {

    @Override
    void buildPillars() {
        System.out.println("Building Pillars with Wood coating.");
    }

    @Override
    void buildWalls() {
        System.out.println("Building wood walls.");
    }
}
