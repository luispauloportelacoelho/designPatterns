package state.state3;

public class Working implements AtmState {

    Atm atm;

    public Working(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void withdraw(int amount) {
        int cashStock = atm.getCashStock();
        if (amount > cashStock) {
            amount = cashStock;
            System.out.println("Partial amount");
        }

        System.out.println(amount + "$ is dispensed");

        int newCashStock = cashStock - amount;

        atm.setCashStock(newCashStock);

        if (newCashStock == 0) {
            atm.setState(new NoCash(atm));
        }
    }

    @Override
    public void refill(int amount) {
        System.out.println(amount + "$ is loaded");
        atm.setCashStock(atm.getCashStock() + amount);
    }
}
