package state.state3.withPattern;

public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert another quarter");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void tumCrank() {
        System.out.println("You tuerned...");
        gumballMachine.setState(gumballMachine.setSoldState);

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
