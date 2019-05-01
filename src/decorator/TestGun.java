package decorator;

public class TestGun {
    public static void main(String[] args) {
        Gun gunWithSilencer = new GunSilencer(new GunBasic());
        gunWithSilencer.build();
    }
}
