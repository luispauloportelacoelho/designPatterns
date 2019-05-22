package template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game football = new Football();
        Game cricket = new Cricket();

        football.play();
        System.out.println();
        cricket.play();
    }
}
