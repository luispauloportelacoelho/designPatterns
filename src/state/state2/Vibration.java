package state.state2;

public class Vibration implements MobileAlertsState {
    @Override
    public void doAction(Context context) {
        System.out.println("Vibration...");
    }
}
