package template.template3;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepareRecipe();
        System.out.println();
        tea.prepareRecipe();
        System.out.println();

        CaffeineBeverage coffeeWithHook = new CoffeeWithHool();
        coffeeWithHook.prepareRecipe();
    }
}
