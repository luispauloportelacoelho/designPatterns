package strategy;

public class RubberDuck extends Duck {
    public RubberDuck () {
        flyBehavior = new FlyWithoutWings();
    }

    public void display() {
        System.out.println("I am a real Rubber Duck");
    }
}
