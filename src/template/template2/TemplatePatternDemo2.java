package template.template2;

public class TemplatePatternDemo2 {
    public static void main(String[] args) {
        House glassHouse = new GlassHouse();
        House woodenHouse = new WoodenHouse();

        glassHouse.build();
        System.out.println();
        woodenHouse.build();
    }
}
