package state.state3;

public class Atm implements AtmState{

    int cashStock;
    AtmState currentState;

    public Atm() {
        currentState = new NoCash(this);
    }

    public int getCashStock() {
        return cashStock;
    }

    public void setCashStock(int cashStock) {
        this.cashStock = cashStock;
    }

    public void setState(AtmState state) {
        currentState = state;
    }

    public AtmState getState() {
        return currentState;
    }

    @Override
    public void withdraw(int amount) {
        currentState.withdraw(amount);
    }

    @Override
    public void refill(int amount) {
        currentState.refill(amount);
    }
}
