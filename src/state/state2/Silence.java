package state.state2;

public class Silence implements MobileAlertsState {
    @Override
    public void doAction(Context context) {
        System.out.println("Silence...");
    }
}
