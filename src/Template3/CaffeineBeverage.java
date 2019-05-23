package Template3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();
    abstract void addCondiments();
}
