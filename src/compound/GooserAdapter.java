package compound;

public class GooserAdapter implements Quackable {
    Goose goose;

    public GooserAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
