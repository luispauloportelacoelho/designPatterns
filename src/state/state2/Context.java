package state.state2;

public class Context {

    private MobileAlertsState mobileAlertsState;

    public Context() {
        mobileAlertsState = new Vibration();
    }

    public void setMobileAlertsState(MobileAlertsState newMobileAlertsState){
        mobileAlertsState = newMobileAlertsState;
    }

    public void alert() {
        mobileAlertsState.doAction(this);
    }
}
