package adapter.adapter2;

public class Adapter implements ITarget {

    Adaptee adaptee;

    public Adapter(Adaptee a) {
        this.adaptee = a;
    }

    @Override
    public void request() {
        this.adaptee.SpecificRequest();
    }
}
