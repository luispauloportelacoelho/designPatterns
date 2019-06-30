package bridge.bridge3;

public class Client {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Test with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
        basicRemote.volumeDown();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
