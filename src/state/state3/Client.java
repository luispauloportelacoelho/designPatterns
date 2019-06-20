package state.state3;

public class Client {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.refill(100);
        atm.withdraw(50);
        atm.withdraw(30);
        atm.withdraw(50);
        atm.withdraw(50);
        atm.withdraw(40);
        atm.refill(200);
        atm.withdraw(10);
    }
}
