package Proxy2;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String servicehost) throws Exception {
        System.out.println("Connecting to "+ servicehost);
    }
}
