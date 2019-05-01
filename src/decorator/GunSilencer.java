package decorator;

public class GunSilencer extends GunDecorator {

    public GunSilencer(Gun gun){
        super(gun);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Add gun silence");
    }
}
