package strategy;

public class FlyWithoutWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I do not fly!!");
    }
}
