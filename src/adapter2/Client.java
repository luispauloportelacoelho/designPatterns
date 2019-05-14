package adapter2;

public class Client {

    public static void main(String[] args) {
        ITarget iTarget = new Adapter(new Adaptee());
        iTarget.request();

        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
