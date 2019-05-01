package decorator;

public class GunTarget extends GunDecorator {

    public GunTarget(Gun gun) {
        super(gun);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Add gun target");
    }
}
