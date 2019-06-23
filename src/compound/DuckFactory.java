package compound;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return null;
    }

    @Override
    public Quackable createDuckCall() {
        return null;
    }

    @Override
    public Quackable createRubberDuck() {
        return null;
    }
}
