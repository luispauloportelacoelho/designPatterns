package template.template2;

public class GlassHouse extends House {

    @Override
    void buildPillars() {
        System.out.println("Building Pillars with Glass coating.");
    }

    @Override
    void buildWalls() {
        System.out.println("Building glass walls.");
    }
}
