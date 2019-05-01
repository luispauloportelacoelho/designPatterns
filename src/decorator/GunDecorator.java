package decorator;

public class GunDecorator implements Gun {

    public Gun gun;

    public GunDecorator(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void build() {
        this.gun.build();
    }
}
