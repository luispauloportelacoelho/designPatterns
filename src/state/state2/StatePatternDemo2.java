package state.state2;

public class StatePatternDemo2 {
    public static void main(String[] args) {
        Context context = new Context();
        context.alert();
        context.alert();

        context.setMobileAlertsState(new Silence());
        context.alert();
        context.alert();
        context.alert();
        context.alert();

        context.setMobileAlertsState(new Vibration());
        context.alert();
    }
}
