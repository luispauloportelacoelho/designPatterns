package decorator;

public class GunBasic implements Gun {
    @Override
    public void build() {
        System.out.println("This gun is basic!");
    }
}
