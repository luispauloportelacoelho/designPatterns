package state.state3.test;

public class Atm {
    int amount;

    int currentAmount = 0;

    public void refill(int amount){
        currentAmount = currentAmount + amount;
        System.out.println(amount + "$ is loaded");
    }

    public void withdraw(int amount){
        if (currentAmount == 0) {
            System.out.println("Atm without cash");
        } else if(currentAmount >= amount) {
            currentAmount = currentAmount - amount;
            System.out.println(amount + "$ is dispended");
        } else if(currentAmount < amount && currentAmount != 0) {
            amount = currentAmount;
            currentAmount = 0;
            System.out.println("Partial amount");
            System.out.println(amount + "$ is dispended");
        }
    }
}
